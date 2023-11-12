package com.ersincabuk.mobiluygulamalar.unite5.uyg1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_uyg1_activity);
    }

    public void btnSelamVer1(View view) {
        selamVer();
    }

    public void btnSelamVer2(View view) {
        selamVer();
    }

    private void selamVer() {
        Toast.makeText(this, "Merhaba!", Toast.LENGTH_SHORT).show();
    }
}