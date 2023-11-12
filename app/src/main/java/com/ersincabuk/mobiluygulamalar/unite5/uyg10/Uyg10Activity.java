package com.ersincabuk.mobiluygulamalar.unite5.uyg10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg10Activity extends AppCompatActivity {
    TextView txtViewBilgi;
    public Asker asker = new Asker();
    public Tankci tankci = new Tankci();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg10_activity);
        txtViewBilgi = findViewById(R.id.txtViewBilgi);
    }

    public void btnAsker(View view) {
        txtViewBilgi.setText(asker.ates());
    }

    public void btnTankci(View view) {
        txtViewBilgi.setText(tankci.ates());
    }
}