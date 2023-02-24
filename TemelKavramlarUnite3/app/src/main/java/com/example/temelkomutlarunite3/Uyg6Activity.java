package com.example.temelkomutlarunite3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uygulama_basit_activity);

        TextView txtCalistirildi = findViewById(R.id.txtCalistirildi);

        Button btnCalistir = findViewById(R.id.btnCalistir);
        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int PI = 3;
                int yariCap = 5;
                txtCalistirildi.setText("Çevre: " + (2 * PI * yariCap));
            }
        });

        Button btnGeri = findViewById(R.id.btnGeri);
        btnGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Uyg6Activity.this, MainActivity.class);
                startActivity(main);
            }
        });

    }
}
