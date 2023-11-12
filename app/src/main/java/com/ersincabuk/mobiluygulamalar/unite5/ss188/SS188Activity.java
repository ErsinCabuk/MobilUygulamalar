package com.ersincabuk.mobiluygulamalar.unite5.ss188;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

public class SS188Activity extends AppCompatActivity {
    EditText txtBirKenar, txtIkiKenar, txtUcKenar;
    TextView txtCevre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_ss188_activity);
        txtBirKenar = findViewById(R.id.txtBirKenar);
        txtIkiKenar = findViewById(R.id.txtIkiKenar);
        txtUcKenar = findViewById(R.id.txtUcKenar);
        txtCevre = findViewById(R.id.txtViewCevre);
    }

    public void btnEskenar(View view) {
        int birKenar = Integer.parseInt(txtBirKenar.getText().toString());
        Ucgen ucgen = new Ucgen(birKenar);
        Integer cevre = ucgen.cevreBul();
        txtCevre.setText(cevre.toString());
    }

    public void btnIkizkenar(View view) {
        int birKenar = Integer.parseInt(txtBirKenar.getText().toString());
        int ikiKenar = Integer.parseInt(txtIkiKenar.getText().toString());
        Ucgen ucgen = new Ucgen(birKenar, ikiKenar);
        Integer cevre = ucgen.cevreBul();
        txtCevre.setText(cevre.toString());
    }

    public void btnCesitkenar(View view) {
        int birKenar = Integer.parseInt(txtBirKenar.getText().toString());
        int ikiKenar = Integer.parseInt(txtIkiKenar.getText().toString());
        int ucKenar = Integer.parseInt(txtUcKenar.getText().toString());
        Ucgen ucgen = new Ucgen(birKenar, ikiKenar, ucKenar);
        Integer cevre = ucgen.cevreBul();
        txtCevre.setText(cevre.toString());
    }
}