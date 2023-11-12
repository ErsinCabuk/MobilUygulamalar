package com.ersincabuk.mobiluygulamalar.unite5.uyg9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg9Activity extends AppCompatActivity {
    EditText txtKenar;
    TextView txtViewCevre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg9_activity);

        txtKenar = findViewById(R.id.txtKenar);
        txtViewCevre = findViewById(R.id.txtViewCevre);
    }

    public void btnUcgen(View view) {
        Integer uzunluk = Integer.parseInt(txtKenar.getText().toString());
        Ucgen ucgen = new Ucgen(uzunluk);
        Integer cevre = ucgen.cevre();
        txtViewCevre.setText(cevre.toString());
    }

    public void btnKare(View view) {
        Integer uzunluk = Integer.parseInt(txtKenar.getText().toString());
        Kare kare = new Kare(uzunluk);
        Integer cevre = kare.cevre();
        txtViewCevre.setText(cevre.toString());
    }
}