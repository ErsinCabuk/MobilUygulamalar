package com.ersincabuk.mobiluygulamalar.unite6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ersincabuk.mobiluygulamalar.R;
import com.ersincabuk.mobiluygulamalar.unite6.ss247.SS247Activity;
import com.ersincabuk.mobiluygulamalar.unite6.uyg1.Uyg1Activity;
import com.ersincabuk.mobiluygulamalar.unite6.uyg10.Uyg10Activity;
import com.ersincabuk.mobiluygulamalar.unite6.uyg2.Uyg2Activity;
import com.ersincabuk.mobiluygulamalar.unite6.uyg3.Uyg3GirisActivity;
import com.ersincabuk.mobiluygulamalar.unite6.uyg4.Uyg4GirisActivity;
import com.ersincabuk.mobiluygulamalar.unite6.uyg5.Uyg5GirisActivity;
import com.ersincabuk.mobiluygulamalar.unite6.uyg6.Uyg6Activity;
import com.ersincabuk.mobiluygulamalar.unite6.uyg8.Uyg8Activity;

public class Unite6Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u6_activity);
    }

    public void btnUyg1(View view) {
        Intent uyg = new Intent(Unite6Activity.this, Uyg1Activity.class);
        startActivity(uyg);
    }

    public void btnUyg2(View view) {
        Intent uyg = new Intent(Unite6Activity.this, Uyg2Activity.class);
        startActivity(uyg);
    }

    public void btnUyg3(View view) {
        Intent uyg = new Intent(Unite6Activity.this, Uyg3GirisActivity.class);
        startActivity(uyg);
    }

    public void btnUyg4(View view) {
        Intent uyg = new Intent(Unite6Activity.this, Uyg4GirisActivity.class);
        startActivity(uyg);
    }

    public void btnUyg5(View view) {
        Intent uyg = new Intent(Unite6Activity.this, Uyg5GirisActivity.class);
        startActivity(uyg);
    }

    public void btnUyg6(View view) {
        Intent uyg = new Intent(Unite6Activity.this, Uyg6Activity.class);
        startActivity(uyg);
    }

    public void btnUyg8(View view) {
        Intent uyg = new Intent(Unite6Activity.this, Uyg8Activity.class);
        startActivity(uyg);
    }

    public void btnUyg10(View view) {
        Intent uyg = new Intent(Unite6Activity.this, Uyg10Activity.class);
        startActivity(uyg);
    }

    public void btnSS247(View view) {
        Intent uyg = new Intent(Unite6Activity.this, SS247Activity.class);
        startActivity(uyg);
    }
}
