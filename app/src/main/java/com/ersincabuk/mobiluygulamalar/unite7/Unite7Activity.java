package com.ersincabuk.mobiluygulamalar.unite7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ersincabuk.mobiluygulamalar.R;
import com.ersincabuk.mobiluygulamalar.unite7.uyg1.Uyg1Activity;
import com.ersincabuk.mobiluygulamalar.unite7.uyg10.Uyg10Activity;
import com.ersincabuk.mobiluygulamalar.unite7.uyg11.Uyg11Activity;
import com.ersincabuk.mobiluygulamalar.unite7.uyg12.Uyg12Activity;
import com.ersincabuk.mobiluygulamalar.unite7.uyg13.Uyg13Activity;
import com.ersincabuk.mobiluygulamalar.unite7.uyg2.Uyg2Activity;
import com.ersincabuk.mobiluygulamalar.unite7.uyg3_uyg4_uyg5_uyg6.UygActivity;
import com.ersincabuk.mobiluygulamalar.unite7.uyg7.Uyg7Activity;
import com.ersincabuk.mobiluygulamalar.unite7.uyg8.Uyg8Activity;
import com.ersincabuk.mobiluygulamalar.unite7.uyg9.Uyg9Activity;

public class Unite7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u7_activity);
    }

    public void btnUyg1(View view) {
        Intent uyg = new Intent(Unite7Activity.this, Uyg1Activity.class);
        startActivity(uyg);
    }

    public void btnUyg2(View view) {
        Intent uyg = new Intent(Unite7Activity.this, Uyg2Activity.class);
        startActivity(uyg);
    }

    public void btnUyg3456(View view) {
        Intent uyg = new Intent(Unite7Activity.this, UygActivity.class);
        startActivity(uyg);
    }

    public void btnUyg7(View view) {
        Intent uyg = new Intent(Unite7Activity.this, Uyg7Activity.class);
        startActivity(uyg);
    }

    public void btnUyg8(View view) {
        Intent uyg = new Intent(Unite7Activity.this, Uyg8Activity.class);
        startActivity(uyg);
    }

    public void btnUyg9(View view) {
        Intent uyg = new Intent(Unite7Activity.this, Uyg9Activity.class);
        startActivity(uyg);
    }

    public void btnUyg10(View view) {
        Intent uyg = new Intent(Unite7Activity.this, Uyg10Activity.class);
        startActivity(uyg);
    }

    public void btnUyg11(View view) {
        Intent uyg = new Intent(Unite7Activity.this, Uyg11Activity.class);
        startActivity(uyg);
    }

    public void btnUyg12(View view) {
        Intent uyg = new Intent(Unite7Activity.this, Uyg12Activity.class);
        startActivity(uyg);
    }

    public void btnUyg13(View view) {
        Intent uyg = new Intent(Unite7Activity.this, Uyg13Activity.class);
        startActivity(uyg);
    }
}