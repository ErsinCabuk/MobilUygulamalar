package com.example.temelkomutlarunite3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama_basit_activity);

        TextView txtCalistirildi = findViewById(R.id.txtCalistirildi);

        Button btnCalistir = findViewById(R.id.btnCalistir);
        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char karakter = 'A';
                txtCalistirildi.setText("Karakter: " + karakter);

                karakter = 'A' + 1;
                txtCalistirildi.setText(txtCalistirildi.getText().toString() + "\nYeni Karakter: " + karakter);

                karakter = 'A' + 32;
                txtCalistirildi.setText(txtCalistirildi.getText().toString() + "\nYeni Karakterin Yeni Karakteri: " + karakter);
            }
        });

        Button btnGeri = findViewById(R.id.btnGeri);
        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Uyg3Activity.this, MainActivity.class);
                startActivity(main);
            }
        });
    }
}
