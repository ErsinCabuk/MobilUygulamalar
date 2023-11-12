package com.ersincabuk.mobiluygulamalar.unite4.uyg6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg6Activity extends AppCompatActivity {
    EditText txtSayi;
    TextView txtViewAy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_uyg6_activity);

        txtSayi = findViewById(R.id.txtSayi);
        txtViewAy = findViewById(R.id.txtViewAy);
    }

    public void btnCalistir(View view) {
        int month = Integer.parseInt(txtSayi.getText().toString());
        String monthName;

        switch (month) {
            case 1:
                monthName = "Ocak";
                break;
            case 2:
                monthName = "Şubat";
                break;
            case 3:
                monthName = "Mart";
                break;
            case 4:
                monthName = "Nisan";
                break;
            case 5:
                monthName = "Mayıs";
                break;
            case 6:
                monthName = "Haziran";
                break;
            case 7:
                monthName = "Temmuz";
                break;
            case 8:
                monthName = "Ağustos";
                break;
            case 9:
                monthName = "Eylül";
                break;
            case 10:
                monthName = "Ekim";
                break;
            case 11:
                monthName = "Kasım";
                break;
            case 12:
                monthName = "Aralık";
                break;
            default:
                monthName = "0 - 12 arası değer giriniz";
        }

        txtViewAy.setText(monthName);
    }
}