package com.ersincabuk.mobiluygulamalar.unite3.uyg2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u3_uyg_basit_activity);

        TextView txtViewBilgi = findViewById(R.id.txtViewBilgi);

        Button btnCalistir = findViewById(R.id.btnCalistir);
        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                byte kucukSayi = 127;
                short kisaSayi = 32767;
                int tamSayi = 2147483647;
                long uzunSayi = 9223372036854775807L;

                txtViewBilgi.setText("byte: " + kucukSayi + "\nshort: " + kisaSayi + "\nint: " + tamSayi + "\nlong: " + uzunSayi);
            }
        });
    }
}
