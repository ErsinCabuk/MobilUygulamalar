package com.ersincabuk.mobiluygulamalar.unite5.uyg2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg2Activity extends AppCompatActivity {
    EditText txtSayi1, txtSayi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg2_activity);

        txtSayi1 = findViewById(R.id.txtSayi1);
        txtSayi2 = findViewById(R.id.txtSayi2);
    }

    public void btnTopla(View view) {
        int result = hesapla();
        Toast.makeText(this, "Toplam: " + result, Toast.LENGTH_SHORT).show();
    }

    public int hesapla() {
        return Integer.parseInt(txtSayi1.getText().toString()) + Integer.parseInt(txtSayi2.getText().toString());
    }
}