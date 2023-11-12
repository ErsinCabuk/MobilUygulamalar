package com.ersincabuk.mobiluygulamalar.unite6.uyg5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg5GirisActivity extends AppCompatActivity {
    EditText txtAdSoyad, txtEposta, txtSifre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u6_uyg5_giris_activity);

        txtAdSoyad = findViewById(R.id.txtAdSoyad);
        txtEposta = findViewById(R.id.txtEposta);
        txtSifre = findViewById(R.id.txtSifre);
    }

    public void btnGiris(View view) {
        String adiSoyadi = txtAdSoyad.getText().toString();
        String eposta = txtEposta.getText().toString();
        String sifre = txtSifre.getText().toString();
        Bilgiler bilgilerSerializable = new Bilgiler(adiSoyadi, eposta, sifre);
        Intent intent = new Intent(this.getApplicationContext(), Uyg5BilgiActivity.class);
        intent.putExtra("bilgiler", bilgilerSerializable);
        startActivity(intent);
    }
}