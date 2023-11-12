package com.ersincabuk.mobiluygulamalar.unite4.uyg3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg3Activity extends AppCompatActivity {
    EditText txtKullaniciAdi, txtSifre;
    final String kullaniciAdi = "ErsinCabuk", sifre = "123456789";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_uyg3_activity);

        txtKullaniciAdi = findViewById(R.id.txtKullaniciAdi);
        txtSifre = findViewById(R.id.txtSifre);
    }

    public void btnCalistir(View view) {
        if(kullaniciAdi.equals(txtKullaniciAdi.getText().toString()) && sifre.equals(txtSifre.getText().toString())) Toast.makeText(this, "Giriş yapıldı.", Toast.LENGTH_LONG).show();
        else Toast.makeText(this, "Giriş hatalı.", Toast.LENGTH_LONG).show();
    }

}