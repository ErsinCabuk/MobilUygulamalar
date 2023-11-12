package com.ersincabuk.mobiluygulamalar.unite6.uyg3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg3BilgiActivity extends AppCompatActivity {
    TextView txtViewAdSoyad, txtViewTelefonNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u6_uyg3_bilgi_activity);

        txtViewAdSoyad = findViewById(R.id.txtViewAdSoyad);
        txtViewTelefonNo = findViewById(R.id.txtViewTelefonNo);

        Intent intent = getIntent();
        String bilgiAdiSoyadi = intent.getStringExtra("adSoyad");
        String bilgiTelefonNo = intent.getStringExtra("telefonNo");
        txtViewAdSoyad.setText(bilgiAdiSoyadi);
        txtViewTelefonNo.setText(bilgiTelefonNo);
    }
}