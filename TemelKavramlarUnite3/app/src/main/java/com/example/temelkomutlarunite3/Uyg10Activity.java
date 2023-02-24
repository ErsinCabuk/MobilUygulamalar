package com.example.temelkomutlarunite3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama_2sayili_activity);

        EditText editSayi1 = findViewById(R.id.editSayi1);
        EditText editSayi2 = findViewById(R.id.editSayi2);
        Button btnHesapla = findViewById(R.id.btnHesapla);
        Button btnGeri = findViewById(R.id.btnGeri);
        TextView textCalistir = findViewById(R.id.textCalistir);

        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(editSayi1.getText().toString());
                int sayi2 = Integer.parseInt(editSayi2.getText().toString());
                textCalistir.setText("Sayı 1 10’dan büyük ve Sayı 2 10’dan küçük mü: " + (sayi1 > 20 && sayi2 < 20));
                textCalistir.setText(textCalistir.getText().toString() + "\nSayı 1 10’dan büyük ve Sayı 2 10’dan küçük mü tersi: " + !(sayi1 > 20 && sayi2 < 20));
                textCalistir.setText(textCalistir.getText().toString() + "\nSayı 1 10’dan büyük veya Sayı 2 10’dan küçük mü: " + (sayi1 > 20 || sayi2 < 20));
                textCalistir.setText(textCalistir.getText().toString() + "\nSayı 1 10’dan büyük veya Sayı 2 10’dan küçük mü tersi: " + !(sayi1 > 20 || sayi2 < 20));
            }
        });

        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Uyg10Activity.this, MainActivity.class);
                startActivity(main);
            }
        });
    }
}
