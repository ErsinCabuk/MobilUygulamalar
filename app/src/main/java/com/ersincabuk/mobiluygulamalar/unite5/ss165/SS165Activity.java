package com.ersincabuk.mobiluygulamalar.unite5.ss165;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ersincabuk.mobiluygulamalar.R;

public class SS165Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_ss165_activity);
    }

    public void btnTopla(View view) {
        int topla = 15 + 15;
        Toast.makeText(this, "Topla: " + topla, Toast.LENGTH_SHORT).show();
    }
}