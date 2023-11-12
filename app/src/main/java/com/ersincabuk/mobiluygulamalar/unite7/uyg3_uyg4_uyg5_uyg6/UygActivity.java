package com.ersincabuk.mobiluygulamalar.unite7.uyg3_uyg4_uyg5_uyg6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.ersincabuk.mobiluygulamalar.R;

import java.util.ArrayList;

public class UygActivity extends AppCompatActivity {
    SQLiteDatabase database;
    ListView listViewUrunler;

    @Override
    @SuppressLint("Range")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u7_uyg3_activity);

        listViewUrunler = findViewById(R.id.listViewUrunler);

        database = openOrCreateDatabase("MobilUygulamalar", MODE_PRIVATE, null);
        database.execSQL("create table if not exists urunler (id integer primary key, ad text, adet text, fiyat text, resim blob)");

        ArrayList<Urun> urunler = new ArrayList<>();

        Cursor cursor = database.rawQuery("select * from urunler", null);
        while(cursor.moveToNext()) {
            int id = cursor.getInt(cursor.getColumnIndex("id"));
            String ad = cursor.getString(cursor.getColumnIndex("ad"));
            String adet = cursor.getString(cursor.getColumnIndex("adet"));
            String fiyat = cursor.getString(cursor.getColumnIndex("fiyat"));
            byte[] resim = cursor.getBlob(cursor.getColumnIndex("resim"));
            urunler.add(new Urun(id, ad, adet, fiyat, resim));
        }
        cursor.close();

        UrunAdapter urunAdapter = new UrunAdapter(this, urunler);
        urunAdapter.notifyDataSetChanged();
        listViewUrunler.setAdapter(urunAdapter);
    }

    public void buttonYeni(View view) {
        Intent i = new Intent(this, IslemlerActivity.class);
        i.putExtra("mod", "yeni");
        startActivity(i);
    }
}