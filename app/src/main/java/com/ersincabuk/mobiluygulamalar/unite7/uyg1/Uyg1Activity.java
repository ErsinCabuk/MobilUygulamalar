package com.ersincabuk.mobiluygulamalar.unite7.uyg1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg1Activity extends AppCompatActivity {
    EditText txtKullaniciAdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u7_uyg1_activity);
        txtKullaniciAdi = findViewById(R.id.txtKullaniciAdi);
        SharedPreferences sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
        String gelenVeri = sharedPreferences.getString("kullaniciAdi", "");
        if(!gelenVeri.isEmpty()) txtKullaniciAdi.setText(gelenVeri);
    }

    public void btnKaydet(View view){
        String veri;
        veri = txtKullaniciAdi.getText().toString();
        SharedPreferences sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("kullaniciAdi", veri);
        editor.apply();
    }
}