package com.ersincabuk.mobiluygulamalar.unite5.uyg11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg11Activity extends AppCompatActivity {
    EditText txtSayi;
    TextView txtViewIndeks, txtViewToplam;
    public Integer[] sayilar = new Integer[6];
    public int indeks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg11_activity);

        txtSayi = findViewById(R.id.txtSayi);
        txtViewIndeks = findViewById(R.id.txtViewIndeks);
        txtViewToplam = findViewById(R.id.txtViewToplam);
    }

    public void btnEkle(View view) {
        if(indeks < 6) {
            int sayi;
            sayi = Integer.parseInt(txtSayi.getText().toString());
            sayilar[indeks]=sayi;
            indeks++;
            txtViewIndeks.setText("İndeks: " + Integer.toString(indeks));
            int toplam = 0;
            for (int i = 0; i < indeks; i++) {
                toplam += sayilar[i];
            }
            txtViewToplam.setText("Toplam: " + Integer.toString(toplam));
            txtSayi.getText().clear();
        } else Toast.makeText(this, "Dizi doldu.", Toast.LENGTH_SHORT).show();
    }

    public void btnSifirla(View view) {
        indeks = 0;
        txtViewIndeks.setText("İndeks: 0");
        txtViewToplam.setText("Toplam: 0");
        sayilar = new Integer[6];
    }
}