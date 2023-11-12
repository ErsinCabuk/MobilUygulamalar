package com.ersincabuk.mobiluygulamalar.unite5.ss206;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

public class SS206Activity extends AppCompatActivity {
    TextView txtViewBilgi;
    public Asker asker = new Asker();
    public Tankci tankci = new Tankci();
    public Topcu topcu = new Topcu();
    String mesaj = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_ss206_activity);
        txtViewBilgi = findViewById(R.id.txtViewBilgi);
    }

    public void btnAsker(View view) {
        mesaj = asker.atesEt();
        txtViewBilgi.setText(mesaj);
    }

    public void btnTankci(View view) {
        mesaj = tankci.atesEt();
        txtViewBilgi.setText(mesaj);
    }

    public void btnTopcu(View view) {
        mesaj = topcu.atesEt();
        txtViewBilgi.setText(mesaj);
    }
}