package com.ersincabuk.mobiluygulamalar.unite6.uyg4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg4GirisActivity extends AppCompatActivity {
    EditText txtKullaniciAdi, txtKullaniciSifre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u6_uyg4_giris_activity);

        txtKullaniciAdi = findViewById(R.id.txtViewKullaniciAdi);
        txtKullaniciSifre = findViewById(R.id.txtViewKullaniciSifre);
    }

    public void btnGiris(View view) {
        String kullaniciAdi = txtKullaniciAdi.getText().toString();
        String parola = txtKullaniciSifre.getText().toString();

        Singleton singleton = Singleton.getInstance();
        singleton.setKullaniciAdi(kullaniciAdi);
        singleton.setKullaniciParola(parola);

        Intent intent = new Intent(this, Uyg4BilgiActivity.class);
        startActivity(intent);
    }
}