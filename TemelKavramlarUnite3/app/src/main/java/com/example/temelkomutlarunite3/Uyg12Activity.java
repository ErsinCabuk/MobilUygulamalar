package com.example.temelkomutlarunite3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg12Activity extends AppCompatActivity {
    private final String TAG = "Etiket";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama_1sayili_activity);

        EditText editSayi = findViewById(R.id.editSayi);
        Log.d(TAG, "debug");

        TextView textCalistir = findViewById(R.id.textCalistir);

        Button btnHesapla = findViewById(R.id.btnHesapla);
        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi = Integer.parseInt(editSayi.getText().toString());

                Log.i(TAG, "Düğmeye tıklandı");

                EditText editText = (EditText) findViewById(R.id.editSayi);
                Log.i(TAG, "Edit Text tanımlandı.");

                String s = editText.getText().toString();
                Log.i(TAG, "Edit Text içindeki yazı alındı.");

                try {
                    sayi = Integer.parseInt(s);
                    Log.i(TAG, "Yazı sayıya çevrildi.");
                } catch(Exception e) {
                    Log.e(TAG,"Çevirme hatası.");
                    sayi = 0;
                } finally {
                    sayi = sayi + 2;
                    Log.i(TAG, "(finally) sayı= " + sayi);
                }

                textCalistir.setText("Logcat'i kontrol edin.");
            }
        });

        Button btnGeri = findViewById(R.id.btnGeri);
        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Uyg12Activity.this, MainActivity.class);
                startActivity(main);
            }
        });
    }
}
