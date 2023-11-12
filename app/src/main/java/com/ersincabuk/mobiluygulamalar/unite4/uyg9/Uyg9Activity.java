package com.ersincabuk.mobiluygulamalar.unite4.uyg9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg9Activity extends AppCompatActivity {
    EditText txtSayilar, txtSayi;
    int sayi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_uyg9_activity);
        txtSayilar = findViewById(R.id.txtSayilar);
        txtSayi = findViewById(R.id.txtSayi);
    }

    public void btnCiftSayilar(View view) {
        String str = "";
        txtSayilar.setText("");
        sayi = Integer.parseInt(txtSayi.getText().toString());
        for (int i = 0; i < sayi; i++) {
            if(i % 2 == 0) str += txtSayilar.getText().toString() + i + " - ";
        }
        str = str.substring(0, str.length() - 3);
        txtSayilar.setText(str);

    }

    public void btnTekSayilar(View view) {
        String str = "";
        txtSayilar.setText("");
        sayi = Integer.parseInt(txtSayi.getText().toString());
        for (int i = 0; i < sayi; i++) {
            if(i % 2 != 0) str += txtSayilar.getText().toString() + i + " - ";
        }
        str = str.substring(0, str.length() - 3);
        txtSayilar.setText(str);
    }

    public void btnTumSayilar(View view) {
        String str = "";
        txtSayilar.setText("");
        sayi = Integer.parseInt(txtSayi.getText().toString());
        for (int i = 0; i < sayi; i++) {
            str += txtSayilar.getText().toString() + i + " - ";
        }
        str = str.substring(0, str.length() - 3);
        txtSayilar.setText(str);
    }
}