package com.ersincabuk.mobiluygulamalar.unite4.uyg10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg10Activity extends AppCompatActivity {
    EditText txtSayi;
    TextView txtViewSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_uyg10_activity);
        txtSayi = findViewById(R.id.txtSayi);
        txtViewSonuc = findViewById(R.id.txtViewSonuc);
    }

    public void btnCalistir(View view) {
        int number = Integer.parseInt(txtSayi.getText().toString());
        int counter = 1;
        long result = 1;
        while(counter <= number) {
            result = result * counter;
            counter++;
        }
        txtViewSonuc.setText("Sonuç: " + result);
    }
}