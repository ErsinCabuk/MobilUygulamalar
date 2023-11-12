package com.ersincabuk.mobiluygulamalar.unite5.ss173;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ersincabuk.mobiluygulamalar.R;

public class SS173Activity extends AppCompatActivity {
    EditText txtAd, txtSoyad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_ss173_activity);
        txtAd = findViewById(R.id.txtAd);
        txtSoyad = findViewById(R.id.txtSoyad);
    }

    public void btnMerhaba1(View view) {
        Toast.makeText(this, "Merhaba " + txtAd.getText().toString(), Toast.LENGTH_SHORT).show();    }

    public void btnMerhaba2(View view) {
        Toast.makeText(this, "İyi Günler " + txtAd.getText().toString() + " " + txtSoyad.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}