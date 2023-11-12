package com.ersincabuk.mobiluygulamalar.unite5.gs1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

public class GS1Activity extends AppCompatActivity {
    Button bir, iki, uc, dort, bes, alti, yedi, sekiz, dokuz, sifir, arti, eksi, carpi, bolu, esittir, sil;
    TextView txtViewSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_gs1_activity);

        bir = findViewById(R.id.bir);
        iki = findViewById(R.id.iki);
        uc = findViewById(R.id.uc);
        dort = findViewById(R.id.dort);
        bes = findViewById(R.id.bes);
        alti = findViewById(R.id.alti);
        yedi = findViewById(R.id.yedi);
        sekiz = findViewById(R.id.sekiz);
        dokuz = findViewById(R.id.dokuz);
        sifir = findViewById(R.id.sifir);
        arti = findViewById(R.id.arti);
        eksi = findViewById(R.id.eksi);
        carpi = findViewById(R.id.carpi);
        bolu = findViewById(R.id.bolu);
        esittir = findViewById(R.id.esittir);
        sil = findViewById(R.id.sil);
        txtViewSonuc = findViewById(R.id.txtViewSonuc);
    }

    public void yaz(View view) {
        Button btn = (Button) view;
        String buttonText = btn.getText().toString();
        String sonuc = txtViewSonuc.getText().toString();
        switch (buttonText) {
            case "+":
            case "-":
            case "*":
            case "/":
                txtViewSonuc.setText(sonuc + " " + buttonText.toString() + " ");
                break;
            default:
                txtViewSonuc.setText(sonuc + buttonText);
        }

    }

    public void esittir(View view) {
        String sonucc = txtViewSonuc.getText().toString();
        String[] sonucDizisi = sonucc.split(" ");

        Log.d("ad", sonucDizisi[0] + " " + sonucDizisi[1] + " " + sonucDizisi[2]);

        int sayi1 = Integer.parseInt(sonucDizisi[0]), sayi2 = Integer.parseInt(sonucDizisi[2]);
        String islem = sonucDizisi[1];

        DortIslem sonuc = new DortIslem(sayi1, sayi2, islem);

        txtViewSonuc.setText(sonucc + " = " + sonuc.sonuc);
    }

    public void sil(View view) {
        txtViewSonuc.setText("");
    }
}