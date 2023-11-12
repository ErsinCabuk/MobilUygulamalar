package com.ersincabuk.mobiluygulamalar.unite3.uyg9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg9Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u3_iki_sayili_activity);

        EditText txtSayi1 = findViewById(R.id.txtSayi1);
        EditText txtSayi2 = findViewById(R.id.txtSayi2);
        TextView txtViewBilgi = findViewById(R.id.txtViewBilgi);

        Button btnCalistir = findViewById(R.id.btnCalistir);
        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(txtSayi1.getText().toString());
                int sayi2 = Integer.parseInt(txtSayi2.getText().toString());
                txtViewBilgi.setText("Sayı 1 ile Sayi 2 eşit mi: " + (sayi1 == sayi2));
                txtViewBilgi.setText(txtViewBilgi.getText().toString() + "\nSayı 1 ile Sayi 2 farklı mı: " + (sayi1 != sayi2));
                txtViewBilgi.setText(txtViewBilgi.getText().toString() + "\nSayı 1, Sayi 2’den büyük mü: " + (sayi1 > sayi2));
                txtViewBilgi.setText(txtViewBilgi.getText().toString() + "\nSayı 1, Sayi 2’den küçük mü:  " + (sayi1 < sayi2));
                txtViewBilgi.setText(txtViewBilgi.getText().toString() + "\nSayı 1, Sayi 2’den büyük veya eşit mi: " + (sayi1 >= sayi2));
                txtViewBilgi.setText(txtViewBilgi.getText().toString() + "\nSayı 1, Sayi 2’den küçük veya eşit mi: " + (sayi1 <= sayi2));
            }
        });
    }
}
