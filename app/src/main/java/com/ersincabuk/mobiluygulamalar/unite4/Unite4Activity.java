package com.ersincabuk.mobiluygulamalar.unite4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ersincabuk.mobiluygulamalar.R;
import com.ersincabuk.mobiluygulamalar.unite4.Unite4Activity;
import com.ersincabuk.mobiluygulamalar.unite4.uyg1.Uyg1Activity;
import com.ersincabuk.mobiluygulamalar.unite4.uyg10.Uyg10Activity;
import com.ersincabuk.mobiluygulamalar.unite4.uyg2.Uyg2Activity;
import com.ersincabuk.mobiluygulamalar.unite4.uyg3.Uyg3Activity;
import com.ersincabuk.mobiluygulamalar.unite4.uyg4.Uyg4Activity;
import com.ersincabuk.mobiluygulamalar.unite4.uyg5.Uyg5Activity;
import com.ersincabuk.mobiluygulamalar.unite4.uyg6.Uyg6Activity;
import com.ersincabuk.mobiluygulamalar.unite4.uyg7.Uyg7Activity;
import com.ersincabuk.mobiluygulamalar.unite4.uyg8.Uyg8Activity;
import com.ersincabuk.mobiluygulamalar.unite4.uyg9.Uyg9Activity;
import com.ersincabuk.mobiluygulamalar.unite4.gs1.GS1Activity;
import com.ersincabuk.mobiluygulamalar.unite4.gs2.GS2Activity;

public class Unite4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u4_activity);
    }

    public void btnUyg1(View view) {
        Intent uyg = new Intent(Unite4Activity.this, Uyg1Activity.class);
        startActivity(uyg);
    }

    public void btnUyg2(View view) {
        Intent uyg = new Intent(Unite4Activity.this, Uyg2Activity.class);
        startActivity(uyg);
    }

    public void btnUyg3(View view) {
        Intent uyg = new Intent(Unite4Activity.this, Uyg3Activity.class);
        startActivity(uyg);
    }

    public void btnUyg4(View view) {
        Intent uyg = new Intent(Unite4Activity.this, Uyg4Activity.class);
        startActivity(uyg);
    }

    public void btnUyg5(View view) {
        Intent uyg = new Intent(Unite4Activity.this, Uyg5Activity.class);
        startActivity(uyg);
    }

    public void btnUyg6(View view) {
        Intent uyg = new Intent(Unite4Activity.this, Uyg6Activity.class);
        startActivity(uyg);
    }

    public void btnUyg7(View view) {
        Intent uyg = new Intent(Unite4Activity.this, Uyg7Activity.class);
        startActivity(uyg);
    }

    public void btnUyg8(View view) {
        Intent uyg = new Intent(Unite4Activity.this, Uyg8Activity.class);
        startActivity(uyg);
    }

    public void btnUyg9(View view) {
        Intent uyg = new Intent(Unite4Activity.this, Uyg9Activity.class);
        startActivity(uyg);
    }

    public void btnUyg10(View view) {
        Intent uyg = new Intent(Unite4Activity.this, Uyg10Activity.class);
        startActivity(uyg);
    }

    public void btnGS1(View view) {
        Intent uyg = new Intent(Unite4Activity.this, GS1Activity.class);
        startActivity(uyg);
    }

    public void btnGS2(View view) {
        Intent uyg = new Intent(Unite4Activity.this, GS2Activity.class);
        startActivity(uyg);
    }
}
