package com.ersincabuk.mobiluygulamalar.unite3.uyg10;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg10Activity extends AppCompatActivity {
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
                txtViewBilgi.setText("Sayı 1 10’dan büyük ve Sayı 2 10’dan küçük mü: " + (sayi1 > 20 && sayi2 < 20));
                txtViewBilgi.setText(txtViewBilgi.getText().toString() + "\nSayı 1 10’dan büyük ve Sayı 2 10’dan küçük mü tersi: " + !(sayi1 > 20 && sayi2 < 20));
                txtViewBilgi.setText(txtViewBilgi.getText().toString() + "\nSayı 1 10’dan büyük veya Sayı 2 10’dan küçük mü: " + (sayi1 > 20 || sayi2 < 20));
                txtViewBilgi.setText(txtViewBilgi.getText().toString() + "\nSayı 1 10’dan büyük veya Sayı 2 10’dan küçük mü tersi: " + !(sayi1 > 20 || sayi2 < 20));            }
        });
    }
}
