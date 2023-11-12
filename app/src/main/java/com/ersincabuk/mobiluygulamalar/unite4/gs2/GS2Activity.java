package com.ersincabuk.mobiluygulamalar.unite4.gs2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.ersincabuk.mobiluygulamalar.R;

public class GS2Activity extends AppCompatActivity {
    EditText txtSayi, txtTekSayilar, txtCiftSayilar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_gs2_activity);

        txtSayi = findViewById(R.id.txtSayi);
        txtTekSayilar = findViewById(R.id.txtTekSayilar);
        txtCiftSayilar = findViewById(R.id.txtCiftSayilar);
    }

    public void btnCalistir(View view) {
        int sayi = Integer.parseInt(txtSayi.getText().toString());
        String tekSayilar = "", ciftSayilar = "";

        txtTekSayilar.setText("");
        txtCiftSayilar.setText("");

        int tekSonuc = 0, ciftSonuc = 0;
        for (int i = 1; i <= sayi; i++)
        {
            if (i % 2 == 0) {
                ciftSonuc = ciftSonuc + i;
                ciftSayilar += ciftSayilar + "\n";
            } else {
                tekSonuc = tekSonuc + i;
                tekSayilar += tekSayilar + "\n";
            }
        }

        txtTekSayilar.setText(tekSonuc);
        txtCiftSayilar.setText(ciftSonuc);
    }
}