package com.ersincabuk.mobiluygulamalar.unite4.uyg8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg8Activity extends AppCompatActivity {
    TextView txtViewBilgi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_uyg7_activity);

        txtViewBilgi = findViewById(R.id.txtViewBilgi);
    }

    public void btnCalistir(View view) {
        txtViewBilgi.setText("LogCat'i kontrol et");
        for (int i = 3; i <= 100; i+=3) {
            System.out.println(i);
        }
    }
}