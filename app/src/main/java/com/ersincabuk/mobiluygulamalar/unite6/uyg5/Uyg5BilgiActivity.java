package com.ersincabuk.mobiluygulamalar.unite6.uyg5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg5BilgiActivity extends AppCompatActivity {
    TextView txtViewAdSoyad, txtViewEposta, txtViewSifre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u6_uyg5_bilgi_activity);

        txtViewAdSoyad = findViewById(R.id.txtViewAdSoyad);
        txtViewEposta = findViewById(R.id.txtViewEposta);
        txtViewSifre = findViewById(R.id.txtViewSifre);

        Intent intent = getIntent();
        Bilgiler bilgiler = (Bilgiler) intent.getSerializableExtra("bilgiler");
        txtViewAdSoyad.setText(bilgiler.getAdiSoyadi());
        txtViewEposta.setText(bilgiler.getEposta());
        txtViewSifre.setText(bilgiler.getSifre());
    }
}