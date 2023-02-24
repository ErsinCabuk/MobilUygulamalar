package com.example.temelkomutlarunite3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama_basit_activity);

        TextView txtCalistirildi = findViewById(R.id.txtCalistirildi);

        Button btnCalistir = findViewById(R.id.btnCalistir);
        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float o1 = 1f/3f;
                double o2 = 1d/3d;
                txtCalistirildi.setText("Float Sayı: " + o1 + "\nOndalık Sayı: " + o2);
            }
        });

        Button btnGeri = findViewById(R.id.btnGeri);
        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Uyg5Activity.this, MainActivity.class);
                startActivity(main);
            }
        });
    }
}
