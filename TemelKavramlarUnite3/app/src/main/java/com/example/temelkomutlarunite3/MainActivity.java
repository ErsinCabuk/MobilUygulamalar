package com.example.temelkomutlarunite3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnUyg1, btnUyg2, btnUyg3, btnUyg4, btnUyg5, btnUyg6, btnUyg7, btnUyg8, btnUyg9, btnUyg10, btnUyg11, btnUyg12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUyg1 = findViewById(R.id.btnUyg1);
        btnUyg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uyg1Activity.class);
                startActivity(uyg);
            }
        });
        btnUyg2 = findViewById(R.id.btnUyg2);
        btnUyg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uyg2Activity.class);
                startActivity(uyg);
            }
        });

        btnUyg3 = findViewById(R.id.btnUyg3);
        btnUyg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uyg3Activity.class);
                startActivity(uyg);
            }
        });

        btnUyg4 = findViewById(R.id.btnUyg4);
        btnUyg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uyg4Activity.class);
                startActivity(uyg);
            }
        });

        btnUyg5 = findViewById(R.id.btnUyg5);
        btnUyg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uyg5Activity.class);
                startActivity(uyg);
            }
        });

        btnUyg6 = findViewById(R.id.btnUyg6);
        btnUyg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uyg6Activity.class);
                startActivity(uyg);
            }
        });

        btnUyg7 = findViewById(R.id.btnUyg7);
        btnUyg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uyg7Activity.class);
                startActivity(uyg);
            }
        });

        btnUyg8 = findViewById(R.id.btnUyg8);
        btnUyg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uyg8Activity.class);
                startActivity(uyg);
            }
        });

        btnUyg9 = findViewById(R.id.btnUyg9);
        btnUyg9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uyg9Activity.class);
                startActivity(uyg);
            }
        });

        btnUyg10 = findViewById(R.id.btnUyg10);
        btnUyg10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uyg10Activity.class);
                startActivity(uyg);
            }
        });

        btnUyg11 = findViewById(R.id.btnUyg11);
        btnUyg11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uyg11Activity.class);
                startActivity(uyg);
            }
        });

        btnUyg12 = findViewById(R.id.btnUyg12);
        btnUyg12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg = new Intent(MainActivity.this, Uyg12Activity.class);
                startActivity(uyg);
            }
        });
    }
}