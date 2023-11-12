package com.ersincabuk.mobiluygulamalar.unite2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ersincabuk.mobiluygulamalar.R;
import com.ersincabuk.mobiluygulamalar.unite2.uyg3.Uyg3Activity;
import com.ersincabuk.mobiluygulamalar.unite2.uyg4.Uyg4Activity;
import com.ersincabuk.mobiluygulamalar.unite2.uyg5.Uyg5Activity;
import com.ersincabuk.mobiluygulamalar.unite2.uyg8.Uyg8Activity;
import com.ersincabuk.mobiluygulamalar.unite2.uyg9.Uyg9Activity;
import com.ersincabuk.mobiluygulamalar.unite6.Unite6Activity;
import com.ersincabuk.mobiluygulamalar.unite6.uyg1.Uyg1Activity;

public class Unite2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u2_activity);
    }

    public void btnUyg3(View view) {
        Intent uyg = new Intent(Unite2Activity.this, Uyg3Activity.class);
        startActivity(uyg);
    }

    public void btnUyg4(View view) {
        Intent uyg = new Intent(Unite2Activity.this, Uyg4Activity.class);
        startActivity(uyg);
    }

    public void btnUyg5(View view) {
        Intent uyg = new Intent(Unite2Activity.this, Uyg5Activity.class);
        startActivity(uyg);
    }

    public void btnUyg8(View view) {
        Intent uyg = new Intent(Unite2Activity.this, Uyg8Activity.class);
        startActivity(uyg);
    }

    public void btnUyg9(View view) {
        Intent uyg = new Intent(Unite2Activity.this, Uyg9Activity.class);
        startActivity(uyg);
    }
}
