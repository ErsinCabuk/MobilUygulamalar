package com.ersincabuk.mobiluygulamalar.unite4.uyg4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg4Activity extends AppCompatActivity {
    Switch lokasyonServisi,lokasyonAl,lokasyonGonder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_uyg4_activity);

        lokasyonServisi = findViewById(R.id.switchKonumServisi);
        lokasyonAl = findViewById(R.id.switchKonumAl);
        lokasyonGonder = findViewById(R.id.switchKonumGönder);

        if(lokasyonServisi.isChecked()) {
            lokasyonAl.setVisibility(View.VISIBLE);
            lokasyonGonder.setVisibility(View.VISIBLE);
        } else {
            lokasyonAl.setVisibility(View.GONE);
            lokasyonGonder.setVisibility(View.GONE);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        lokasyonServisi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(lokasyonServisi.isChecked()) {
                    lokasyonAl.setVisibility(View.VISIBLE);
                    lokasyonGonder.setVisibility(View.VISIBLE);
                } else {
                    lokasyonAl.setVisibility(View.GONE);
                    lokasyonGonder.setVisibility(View.GONE);
                }
            }
        });
    }

    public void btnCalistir(View view) {
        if(!lokasyonServisi.isChecked()) Toast.makeText(this, "Konum servisleri kapalı.", Toast.LENGTH_LONG).show();
        else {
            if(lokasyonAl.isChecked() == true && lokasyonGonder.isChecked() == true) Toast.makeText(this, "Konum al ve Konum gönder açık.", Toast.LENGTH_LONG).show();
            if(lokasyonAl.isChecked() == true && lokasyonGonder.isChecked() == false) Toast.makeText(this, "Konum al açık, Konum gönder kapalı.", Toast.LENGTH_LONG).show();
            if(lokasyonAl.isChecked() == false && lokasyonGonder.isChecked() == true) Toast.makeText(this, "Konum al kapalı, Konum gönder açık.", Toast.LENGTH_LONG).show();
            if(lokasyonAl.isChecked() == false && lokasyonGonder.isChecked() == false) Toast.makeText(this, "Konum al ve Konum gönder kapalı.", Toast.LENGTH_LONG).show();
        }
    }
}