package com.ersincabuk.mobiluygulamalar.unite4.uyg2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg2Activity extends AppCompatActivity {
    EditText txtSayi1, txtSayi2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_uyg2_activity);
        txtSayi1 = findViewById(R.id.txtSayi1);
        txtSayi2 = findViewById(R.id.txtSayi2);
    }

    public void btnCalistir(View view) {
        int number1 = Integer.parseInt(txtSayi1.getText().toString());
        int number2 = Integer.parseInt(txtSayi2.getText().toString());
        if(number1 > number2) {
            Toast.makeText(Uyg2Activity.this,"1. sayı daha büyüktür",Toast.LENGTH_LONG).show();
        }
        if(number2 > number1) {
            Toast.makeText(Uyg2Activity.this,"2. sayı daha büyüktür.",Toast.LENGTH_LONG).show();
        }
        if(number1 == number2) {
            Toast.makeText(Uyg2Activity.this,"İki sayı birbirine eşittir.",Toast.LENGTH_LONG).show();
        }
    }
}