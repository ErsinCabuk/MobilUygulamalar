package com.ersincabuk.mobiluygulamalar.unite5.uyg5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Uyg5Activity extends AppCompatActivity {
    EditText txtCihazAdi, txtCihazGucu, txtCihazGunluk;
    TextView txtViewSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg5_activity);

        txtCihazAdi = findViewById(R.id.txtCihazAdi);
        txtCihazGucu = findViewById(R.id.txtCihazGucu);
        txtCihazGunluk = findViewById(R.id.txtCihazGunluk);
        txtViewSonuc = findViewById(R.id.textResult);
    }

    public void btnHesapla(View view) {
        String deviceName = txtCihazAdi.getText().toString();
        double kw = Double.parseDouble(txtCihazGucu.getText().toString());
        int daily = Integer.parseInt(txtCihazGunluk.getText().toString());

        ElektrikliCihaz device = new ElektrikliCihaz();
        device.cihazAdi = deviceName;
        device.cihazGucu = kw;
        device.cihazGunluk = daily;
        NumberFormat formatter = new DecimalFormat("#0.00");
        String resultMonthly = formatter.format(device.aylikKullanim());
        String resultPrice = formatter.format(device.ucret());
        txtViewSonuc.setText("Aylık Kullanılan KW: " + resultMonthly + " KW \nFatura: " + resultPrice + " TL");
    }
}