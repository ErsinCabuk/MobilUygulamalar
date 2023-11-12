package com.ersincabuk.mobiluygulamalar.unite6.uyg4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg4BilgiActivity extends AppCompatActivity {
    TextView txtViewKullaniciAdi, txtViewKullaniciSifre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u6_uyg4_bilgi_activity);

        txtViewKullaniciAdi = findViewById(R.id.txtViewKullaniciAdi);
        txtViewKullaniciSifre = findViewById(R.id.txtViewKullaniciSifre);

        String kullaniciAdi = Singleton.getInstance().getKullaniciAdi();
        String parola = Singleton.getInstance().getKullaniciParola();
        txtViewKullaniciAdi.setText(kullaniciAdi);
        txtViewKullaniciSifre.setText(parola);
    }
}