package com.ersincabuk.mobiluygulamalar.unite5.uyg4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg4Activity extends AppCompatActivity {
    EditText txtSayi1, txtSayi2, txtSayi3;
    TextView txtViewSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg4_activity);

        txtSayi1 = findViewById(R.id.txtSayi1);
        txtSayi2 = findViewById(R.id.txtSayi2);
        txtSayi3 = findViewById(R.id.txtSayi3);
        txtViewSonuc = findViewById(R.id.txtViewSonuc);
    }

    public void btnIkiSayiyiTopla(View view) {
        int sayi1 = Integer.parseInt(txtSayi1.getText().toString());
        int sayi2 = Integer.parseInt(txtSayi2.getText().toString());
        txtViewSonuc.setText("Sonuç: " + Integer.toString(topla(sayi1, sayi2)));
    }

    public void btnUcSayiyiTopla(View view) {
        int sayi1 = Integer.parseInt(txtSayi1.getText().toString());
        int sayi2 = Integer.parseInt(txtSayi2.getText().toString());
        int sayi3 = Integer.parseInt(txtSayi3.getText().toString());
        txtViewSonuc.setText("Sonuç: " + Integer.toString(topla(sayi1, sayi2, sayi3)));
    }

    private int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    private int topla(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }
}