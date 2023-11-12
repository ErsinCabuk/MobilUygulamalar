package com.ersincabuk.mobiluygulamalar.unite4.uyg1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg1Activity extends AppCompatActivity {
    EditText txtSayi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_uyg1_activity);

        txtSayi = findViewById(R.id.txtSayi);
    }

    public void btnCalistir(View view) {
        int number = Integer.parseInt(txtSayi.getText().toString());
        if(number > 100) Toast.makeText(this, "100'den büyük değer girilmez.", Toast.LENGTH_LONG).show();
        else Toast.makeText(this, "Not kaydedildi.", Toast.LENGTH_LONG).show();
    }
}