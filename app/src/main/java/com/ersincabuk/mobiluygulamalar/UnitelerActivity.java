package com.ersincabuk.mobiluygulamalar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import com.ersincabuk.mobiluygulamalar.unite2.Unite2Activity;
import com.ersincabuk.mobiluygulamalar.unite3.Unite3Activity;
import com.ersincabuk.mobiluygulamalar.unite4.Unite4Activity;
import com.ersincabuk.mobiluygulamalar.unite5.Unite5Activity;
import com.ersincabuk.mobiluygulamalar.unite6.Unite6Activity;
import com.ersincabuk.mobiluygulamalar.unite7.Unite7Activity;

public class UnitelerActivity extends AppCompatActivity {
    SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uniteler_activity);
    }

    public void btnUnite2(View view) {
        Intent uyg = new Intent(UnitelerActivity.this, Unite2Activity.class);
        startActivity(uyg);
    }

    public void btnUnite3(View view) {
        Intent uyg = new Intent(UnitelerActivity.this, Unite3Activity.class);
        startActivity(uyg);
    }

    public void btnUnite4(View view) {
        Intent uyg = new Intent(UnitelerActivity.this, Unite4Activity.class);
        startActivity(uyg);
    }

    public void btnUnite5(View view) {
        Intent uyg = new Intent(UnitelerActivity.this, Unite5Activity.class);
        startActivity(uyg);
    }

    public void btnUnite6(View view) {
        Intent uyg = new Intent(UnitelerActivity.this, Unite6Activity.class);
        startActivity(uyg);
    }

    public void btnUnite7(View view) {
        Intent uyg = new Intent(UnitelerActivity.this, Unite7Activity.class);
        startActivity(uyg);
    }
}