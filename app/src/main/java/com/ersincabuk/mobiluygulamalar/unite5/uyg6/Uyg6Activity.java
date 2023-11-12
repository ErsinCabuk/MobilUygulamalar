package com.ersincabuk.mobiluygulamalar.unite5.uyg6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg6Activity extends AppCompatActivity {
    EditText txtKisaKenar, txtUzunKenar;
    TextView txtViewAlan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg6_activity);
        txtKisaKenar = findViewById(R.id.txtKisaKenar);
        txtUzunKenar = findViewById(R.id.txtUzunKenar);
        txtViewAlan = findViewById(R.id.txtViewAlan);
    }

    public void btnKareAlani(View view) {
        int kenar = Integer.parseInt(txtKisaKenar.getText().toString());
        Dortgen kare = new Dortgen(kenar);
        Integer alan = kare.alanBul();
        txtViewAlan.setText(alan.toString());
    }

    public void btnDikdortgenAlani(View view) {
        int kisaKenar = Integer.parseInt(txtKisaKenar.getText().toString());
        int uzunKenar = Integer.parseInt(txtUzunKenar.getText().toString());
        Dortgen dikdortgen = new Dortgen(kisaKenar, uzunKenar);
        Integer alan = dikdortgen.alanBul();
        txtViewAlan.setText(alan.toString());
    }
}