package com.ersincabuk.mobiluygulamalar.unite3.uyg7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg7Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u3_iki_sayili_activity);

        EditText editSayi1 = findViewById(R.id.txtSayi1);
        EditText editSayi2 = findViewById(R.id.txtSayi2);
        TextView textCalistir = findViewById(R.id.txtViewBilgi);

        Button btnCalistir = findViewById(R.id.btnCalistir);
        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(editSayi1.getText().toString());
                int sayi2 = Integer.parseInt(editSayi2.getText().toString());

                int toplam = sayi1 + sayi2;
                textCalistir.setText("Toplam: " + toplam);

                int fark = sayi1 - sayi2;
                textCalistir.setText(textCalistir.getText().toString() + "\nFark: " + fark);

                int carpim = sayi1 * sayi2;
                textCalistir.setText(textCalistir.getText().toString() + "\nÇarpım: " + carpim);

                int bolme = sayi1 / sayi2;
                textCalistir.setText(textCalistir.getText().toString() + "\nBölme: " + bolme);

                int mod = sayi1 % sayi2;
                textCalistir.setText(textCalistir.getText().toString() + "\nMod Alma: " + mod);

                sayi1++;
                textCalistir.setText(textCalistir.getText().toString() + "\nArtırma: " + sayi1);

                sayi2--;
                textCalistir.setText(textCalistir.getText().toString() + "\nAzaltma: " + sayi2);
            }
        });
    }
}
