package com.ersincabuk.mobiluygulamalar.unite4.uyg5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg5Activity extends AppCompatActivity {
    EditText txtSayi1, txtSayi2, txtSayi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_uyg5_activity);

        txtSayi1 = findViewById(R.id.txtSayi1);
        txtSayi2 = findViewById(R.id.txtSayi2);
        txtSayi3 = findViewById(R.id.txtSayi3);
    }

    public void btnCalistir(View view) {
        int sayi1 = Integer.parseInt(txtSayi1.getText().toString()),
            sayi2 = Integer.parseInt(txtSayi2.getText().toString()),
            sayi3 = Integer.parseInt(txtSayi3.getText().toString());
        float ortalama = (sayi1 + sayi2 + sayi3) / 3;

        if(sayi1 > 100 || sayi2 > 100 || sayi3 > 100) Toast.makeText(this, "Girilen not bilgileri hatalı", Toast.LENGTH_LONG).show();
        else if(ortalama >= 0 && ortalama < 25) Toast.makeText(this, "Ortalamanız " + ortalama + ". 0 ile kaldınız.", Toast.LENGTH_LONG).show();
        else if(ortalama >= 25 && ortalama < 50) Toast.makeText(this, "Ortalamanız " + ortalama + ". 1 ile kaldınız.", Toast.LENGTH_LONG).show();
        else if(ortalama >= 50 && ortalama < 60) Toast.makeText(this, "Ortalamanız " + ortalama + ". 2 ile geçtiniz.", Toast.LENGTH_LONG).show();
        else if(ortalama >= 60 && ortalama < 70) Toast.makeText(this, "Ortalamanız " + ortalama + ". 3 ile geçtiniz.", Toast.LENGTH_LONG).show();
        else if(ortalama >= 70 && ortalama < 85) Toast.makeText(this, "Ortalamanız " + ortalama + ". 4 ile geçtiniz.", Toast.LENGTH_LONG).show();
        else if(ortalama >= 85 && ortalama < 100) Toast.makeText(this, "Ortalamanız " + ortalama + ". 5 ile geçtiniz. Tebrikler!", Toast.LENGTH_LONG).show();
        else Toast.makeText(this, "Girilen not bilgileri hatalı.", Toast.LENGTH_LONG).show();
    }
}