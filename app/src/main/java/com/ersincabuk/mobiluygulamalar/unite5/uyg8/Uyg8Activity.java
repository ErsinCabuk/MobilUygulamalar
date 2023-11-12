package com.ersincabuk.mobiluygulamalar.unite5.uyg8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg8Activity extends AppCompatActivity {
    TextView txtViewBilgi;
    Araba araba = new Araba();
    Minibus minibus = new Minibus();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg8_activity);

        txtViewBilgi = findViewById(R.id.txtViewBilgi);
        araba.setKapiSayisi(5);
        araba.setMaksimumHiz(210);

        minibus.setKapiSayisi(3);
        minibus.setMaksimumHiz(170);
    }

    public void btnArabaKapiSayisi(View view) {
        txtViewBilgi.setText(araba.kapiSayisiniGoster());
    }

    public void btnArabaMaksHizi(View view) {
        txtViewBilgi.setText(araba.maksimumHizGoster());
    }

    public void btnArabaCalistir(View view) {
        txtViewBilgi.setText(araba.calistir());
    }

    public void btnArabaIseGit(View view) {
        txtViewBilgi.setText(araba.iseGit());
    }

    public void btnMinibusKapiSayisi(View view) {
        txtViewBilgi.setText(minibus.kapiSayisiniGoster());
    }

    public void btnMinibusMaksHizi(View view) {
        txtViewBilgi.setText(minibus.maksimumHizGoster());
    }

    public void btnMinibusCalistir(View view) {
        txtViewBilgi.setText(minibus.calistir());
    }

    public void btnMinibusYolcuIndir(View view) {
        txtViewBilgi.setText(minibus.yolcuIndir());
    }

}