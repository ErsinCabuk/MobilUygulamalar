package com.ersincabuk.mobiluygulamalar.unite5.uyg13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.ersincabuk.mobiluygulamalar.R;

import java.util.ArrayList;

public class Uyg13Activity extends AppCompatActivity {
    Oyuncu oyuncu1, oyuncu2;
    Button btnTankciAtesi1, btnTankciAtesi2, btnTopcuAtesi1, btnTopcuAtesi2, btnBasla, btnKaydet;
    ProgressBar progressBar1, progressBar2;
    TextView txtViewHasar;

    Integer hasar;
    EditText txtTopcuAtesGucu, txtTankciAtesGucu;
    ArrayList<Oyuncu> oyuncular = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg13_activity);

        txtTankciAtesGucu = findViewById(R.id.txtTankciAtesGucu);
        txtTopcuAtesGucu = findViewById(R.id.txtTopcuAtesGucu);

        oyuncu1 = new Oyuncu("Oyuncu 1", 100, 3, 5);
        oyuncu2 = new Oyuncu("Oyuncu 2", 100, 3, 5);

        oyuncular.add(oyuncu1);
        oyuncular.add(oyuncu2);

        btnTankciAtesi1 = findViewById(R.id.btnTankciAtesi1);
        btnTopcuAtesi1 = findViewById(R.id.btnTopcuAtesi1);

        btnTankciAtesi2 = findViewById(R.id.btnTankciAtesi2);
        btnTopcuAtesi2 = findViewById(R.id.btnTopcuAtesi2);

        btnBasla = findViewById(R.id.btnBasla);

        btnKaydet = findViewById(R.id.btnKaydet);

        progressBar1 = findViewById(R.id.progressBar1);
        progressBar2 = findViewById(R.id.progressBar2);

        txtViewHasar = findViewById(R.id.txtViewHasar);

        btnTankciAtesi1.setOnClickListener(view -> {
            hasar = oyuncu1.tankci.atesEt(oyuncu2);
            progressBar2.setProgress(oyuncu2.getCan());
            txtViewHasar.setText(hasar.toString());
            oyuncuKontrolet();
        });

        btnTopcuAtesi1.setOnClickListener(view -> {
            hasar = oyuncu1.topcu.atesEt(oyuncu2);
            progressBar2.setProgress(oyuncu2.getCan());
            txtViewHasar.setText(hasar.toString());
            oyuncuKontrolet();
        });

        btnTankciAtesi2.setOnClickListener(view -> {
            hasar = oyuncu2.tankci.atesEt(oyuncu1);
            progressBar1.setProgress(oyuncu1.getCan());
            txtViewHasar.setText(hasar.toString());
            oyuncuKontrolet();
        });

        btnTopcuAtesi2.setOnClickListener(view -> {
            hasar = oyuncu2.topcu.atesEt(oyuncu1);
            progressBar1.setProgress(oyuncu1.getCan());
            txtViewHasar.setText(hasar.toString());
            oyuncuKontrolet();
        });

        btnBasla.setOnClickListener(view -> {
            oyuncu1.setCan(100);
            oyuncu2.setCan(100);
            progressBar1.setProgress(oyuncu1.getCan());
            progressBar2.setProgress(oyuncu2.getCan());
            txtViewHasar.setText("0");
        });

        btnKaydet.setOnClickListener(view -> {
            Integer tankciAG = Integer.parseInt(txtTankciAtesGucu.getText().toString());
            Integer topcuAG = Integer.parseInt(txtTopcuAtesGucu.getText().toString());
            oyuncu1.tankci.setAtesGucu(tankciAG);
            oyuncu1.topcu.setAtesGucu(topcuAG);
            oyuncu2.topcu.setAtesGucu(tankciAG);
            oyuncu2.tankci.setAtesGucu(topcuAG);
            Toast.makeText(this, "Kaydedildi", Toast.LENGTH_SHORT).show();
        });
    }

    private void oyuncuKontrolet() {
        for (Oyuncu oyuncu : oyuncular) {
            if (oyuncu.getCan() <= 0)
                txtViewHasar.setText("Oyun Bitti");
        }
    }
}