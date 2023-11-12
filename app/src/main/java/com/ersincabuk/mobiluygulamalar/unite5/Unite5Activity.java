package com.ersincabuk.mobiluygulamalar.unite5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ersincabuk.mobiluygulamalar.R;
import com.ersincabuk.mobiluygulamalar.unite5.gs1.GS1Activity;
import com.ersincabuk.mobiluygulamalar.unite5.ss165.SS165Activity;
import com.ersincabuk.mobiluygulamalar.unite5.ss168.SS168Activity;
import com.ersincabuk.mobiluygulamalar.unite5.ss173.SS173Activity;
import com.ersincabuk.mobiluygulamalar.unite5.ss188.SS188Activity;
import com.ersincabuk.mobiluygulamalar.unite5.ss206.SS206Activity;
import com.ersincabuk.mobiluygulamalar.unite5.ss214.SS214Activity;
import com.ersincabuk.mobiluygulamalar.unite5.uyg10.Uyg10Activity;
import com.ersincabuk.mobiluygulamalar.unite5.uyg11.Uyg11Activity;
import com.ersincabuk.mobiluygulamalar.unite5.uyg12.Uyg12Activity;
import com.ersincabuk.mobiluygulamalar.unite5.uyg13.Uyg13Activity;
import com.ersincabuk.mobiluygulamalar.unite5.uyg2.Uyg2Activity;
import com.ersincabuk.mobiluygulamalar.unite5.uyg3.Uyg3Activity;
import com.ersincabuk.mobiluygulamalar.unite5.uyg4.Uyg4Activity;
import com.ersincabuk.mobiluygulamalar.unite5.uyg5.Uyg5Activity;
import com.ersincabuk.mobiluygulamalar.unite5.uyg6.Uyg6Activity;
import com.ersincabuk.mobiluygulamalar.unite5.uyg7.Uyg7Activity;
import com.ersincabuk.mobiluygulamalar.unite5.uyg8.Uyg8Activity;
import com.ersincabuk.mobiluygulamalar.unite5.uyg9.Uyg9Activity;
import com.ersincabuk.mobiluygulamalar.unite5.uyg1.Uyg1Activity;

public class Unite5Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u5_activity);
    }

    public void btnUyg1(View view) {
        Intent uyg = new Intent(Unite5Activity.this, Uyg1Activity.class);
        startActivity(uyg);
    }

    public void btnUyg2(View view) {
        Intent uyg = new Intent(Unite5Activity.this, Uyg2Activity.class);
        startActivity(uyg);
    }

    public void btnUyg3(View view) {
        Intent uyg = new Intent(Unite5Activity.this, Uyg3Activity.class);
        startActivity(uyg);
    }

    public void btnUyg4(View view) {
        Intent uyg = new Intent(Unite5Activity.this, Uyg4Activity.class);
        startActivity(uyg);
    }

    public void btnUyg5(View view) {
        Intent uyg = new Intent(Unite5Activity.this, Uyg5Activity.class);
        startActivity(uyg);
    }

    public void btnUyg6(View view) {
        Intent uyg = new Intent(Unite5Activity.this, Uyg6Activity.class);
        startActivity(uyg);
    }

    public void btnUyg7(View view) {
        Intent uyg = new Intent(Unite5Activity.this, Uyg7Activity.class);
        startActivity(uyg);
    }

    public void btnUyg8(View view) {
        Intent uyg = new Intent(Unite5Activity.this, Uyg8Activity.class);
        startActivity(uyg);
    }

    public void btnUyg9(View view) {
        Intent uyg = new Intent(Unite5Activity.this, Uyg9Activity.class);
        startActivity(uyg);
    }

    public void btnUyg10(View view) {
        Intent uyg = new Intent(Unite5Activity.this, Uyg10Activity.class);
        startActivity(uyg);
    }

    public void btnUyg11(View view) {
        Intent uyg = new Intent(Unite5Activity.this, Uyg11Activity.class);
        startActivity(uyg);
    }

    public void btnUyg12(View view) {
        Intent uyg = new Intent(Unite5Activity.this, Uyg12Activity.class);
        startActivity(uyg);
    }

    public void btnUyg13(View view) {
        Intent uyg = new Intent(Unite5Activity.this, Uyg13Activity.class);
        startActivity(uyg);
    }

    public void btnSS165(View view) {
        Intent uyg = new Intent(Unite5Activity.this, SS165Activity.class);
        startActivity(uyg);
    }

    public void btnSS168(View view) {
        Intent uyg = new Intent(Unite5Activity.this, SS168Activity.class);
        startActivity(uyg);
    }

    public void btnSS173(View view) {
        Intent uyg = new Intent(Unite5Activity.this, SS173Activity.class);
        startActivity(uyg);
    }

    public void btnSS188(View view) {
        Intent uyg = new Intent(Unite5Activity.this, SS188Activity.class);
        startActivity(uyg);
    }

    public void btnSS206(View view) {
        Intent uyg = new Intent(Unite5Activity.this, SS206Activity.class);
        startActivity(uyg);
    }

    public void btnSS214(View view) {
        Intent uyg = new Intent(Unite5Activity.this, SS214Activity.class);
        startActivity(uyg);
    }

    public void btnGS1(View view) {
        Intent uyg = new Intent(Unite5Activity.this, GS1Activity.class);
        startActivity(uyg);
    }
}