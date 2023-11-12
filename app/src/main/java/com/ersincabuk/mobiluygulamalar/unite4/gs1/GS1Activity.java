package com.ersincabuk.mobiluygulamalar.unite4.gs1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

public class GS1Activity extends AppCompatActivity {
    TextView txtViewSonuc;
    EditText txtSayi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_gs1_activity);

        txtSayi = findViewById(R.id.txtSayi);
        txtViewSonuc = findViewById(R.id.txtViewSonuc);
    }

    public void btnCalistir(View view) {
        int sayi = Integer.parseInt(txtSayi.getText().toString());
        String sonuc = "";
        txtViewSonuc.setText("");
        for (int i = 1; i <= 10; i++) sonuc += sayi + " x " + i + " = " + sayi * i + " \n";
        txtViewSonuc.setText(sonuc);
    }
}