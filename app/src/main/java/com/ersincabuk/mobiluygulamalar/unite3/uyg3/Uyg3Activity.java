package com.ersincabuk.mobiluygulamalar.unite3.uyg3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u3_uyg_basit_activity);

        TextView txtViewBilgi = findViewById(R.id.txtViewBilgi);

        Button btnCalistir = findViewById(R.id.btnCalistir);
        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char karakter = 'A';
                txtViewBilgi.setText("Karakter: " + karakter);

                karakter = 'A' + 1;
                txtViewBilgi.setText(txtViewBilgi.getText().toString() + "\nYeni Karakter: " + karakter);

                karakter = 'A' + 32;
                txtViewBilgi.setText(txtViewBilgi.getText().toString() + "\nYeni Karakterin Yeni Karakteri: " + karakter);
            }
        });
    }
}