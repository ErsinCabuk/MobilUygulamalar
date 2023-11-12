package com.ersincabuk.mobiluygulamalar.unite6.uyg3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg3GirisActivity extends AppCompatActivity {
    EditText txtAdSoyad, txtTelefonNo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u6_uyg3_giris_activity);
        txtAdSoyad = findViewById(R.id.txtAdSoyad);
        txtTelefonNo = findViewById(R.id.txtTelefonNo);
    }

    public void btnGiris(View view){
        String adSoyad = txtAdSoyad.getText().toString();
        String telefonNo = txtTelefonNo.getText().toString();
        Intent intent = new Intent(Uyg3GirisActivity.this, Uyg3BilgiActivity.class);
        intent.putExtra("adSoyad", adSoyad);
        intent.putExtra("telefonNo", telefonNo);
        startActivity(intent);
    }
}
