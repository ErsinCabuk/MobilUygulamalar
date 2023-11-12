package com.ersincabuk.mobiluygulamalar.unite5.uyg7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg7Activity extends AppCompatActivity {
    EditText txtYas;
    TextView txtViewCevre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg7_activity);
        txtYas = findViewById(R.id.txtYas);
        txtViewCevre = findViewById(R.id.txtViewSonuc);
    }

    public void btnCalistir(View view) {
        int yas = Integer.parseInt(txtYas.getText().toString());
        Personel personel = new Personel();
        personel.setYas(yas);
        txtViewCevre.setText(Integer.toString(personel.getYas()));
    }
}