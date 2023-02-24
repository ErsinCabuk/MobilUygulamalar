package com.example.ekrantasarmunite_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnUygulama3;
    Button btnUygulama4;
    Button btnUygulama5;
    Button btnUygulama8;
    Button btnUygulama9;
    Button btnUygulama10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUygulama3 = findViewById(R.id.btnUygulama3);
        btnUygulama3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg3 = new Intent(MainActivity.this, Uyg3Activity.class);
                startActivity(uyg3);
            }
        });

        btnUygulama4 = findViewById(R.id.btnUygulama4);
        btnUygulama4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg4 = new Intent(MainActivity.this, Uyg4Activity.class);
                startActivity(uyg4);
            }
        });

        btnUygulama5 = findViewById(R.id.btnUygulama5);
        btnUygulama5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg5 = new Intent(MainActivity.this, Uyg5Activity.class);
                startActivity(uyg5);
            }
        });

        btnUygulama8 = findViewById(R.id.btnUygulama8);
        btnUygulama8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg8 = new Intent(MainActivity.this, Uyg8Activity.class);
                startActivity(uyg8);
            }
        });

        btnUygulama9 = findViewById(R.id.btnUygulama9);
        btnUygulama9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg9 = new Intent(MainActivity.this, Uyg9Activity.class);
                startActivity(uyg9);
            }
        });

        btnUygulama10 = findViewById(R.id.btnUygulama10);
        btnUygulama10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uyg10 = new Intent(MainActivity.this, Uyg9Activity.class);
                startActivity(uyg10);
            }
        });
    }
}