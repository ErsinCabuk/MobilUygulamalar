package com.example.adamasmaca;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    LinearLayout linearLayoutKelime, linearLayoutHarfler1;
    Button buttonOyun;
    String[] kelimeler = {"MAL", "SALİH", "AKILLI", "AHMET", "ANANI"};
    String kelime = "";
    int hata = 7;
    ArrayList<String> kelimeHarfler = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOyun = findViewById(R.id.buttonOyun);
        imageView = findViewById(R.id.imageView);
        linearLayoutKelime = findViewById(R.id.linearLayoutKelime);
        linearLayoutHarfler1 = findViewById(R.id.linearLayoutHarfler1);
    }

    public void buttonOyun(View view) {
        Button button = (Button) view;
        if(button.getText().toString().equals("Başlat")) {
            int random = new Random().nextInt(kelimeler.length);
            kelime = kelimeler[random];
            kelimeHarfler.clear();

            for (int i = 0; i < kelime.length(); i++) {
                TextView textViewHarf = new TextView(this);
                textViewHarf.setText(String.valueOf(" _ "));
                textViewHarf.setTextSize(34);
                textViewHarf.setTextColor(getResources().getColor(R.color.black));
                linearLayoutKelime.addView(textViewHarf);
            }
            button.setText("Sıfırla");
        } else {
            int random = new Random().nextInt(kelimeler.length);
            kelime = kelimeler[random];
            kelimeHarfler.clear();
            Log.d("TAG", kelime + " sıfırla");
            linearLayoutKelime.removeAllViews();
            for (int i = 0; i < kelime.length(); i++) {
                TextView textViewHarf = new TextView(this);
                textViewHarf.setText(String.valueOf(" _ "));
                textViewHarf.setTextSize(34);
                textViewHarf.setTextColor(getResources().getColor(R.color.black));
                linearLayoutKelime.addView(textViewHarf);
            }
        }
    }

    public void buttonHarf(View view) {
        Button buttonHarf = (Button) view;
        String harf = buttonHarf.getText().toString();
        if(kelime.isEmpty()) Toast.makeText(this, "Lütfen oyunu başlatınız.", Toast.LENGTH_LONG).show();
        else if(kelime.contains(harf)) {
            for(int i = 0; i < linearLayoutKelime.getChildCount(); i++) {
                TextView harfView = (TextView) linearLayoutKelime.getChildAt(i);
                if(harfView.getText().toString().equals(harf)) harfView.setText(harf);
            }

            kelimeHarfler.add(kelime.indexOf(harf), harf);
            if(kelime.equals(String.join("", kelimeHarfler))) {
                buttonOyun.setText("Başlat");
                linearLayoutKelime.removeAllViews();
                imageView.setImageResource(R.drawable.adam_asmaca_7);
                hata = 7;
                Toast.makeText(this, "Oyun bitti, kazandınız!", Toast.LENGTH_LONG).show();
            }
        } else {
            if(hata == 7) {
                hata = hata - 1;
                imageView.setImageResource(R.drawable.adam_asmaca_6);
            } else if(hata == 6) {
                hata = hata - 1;
                imageView.setImageResource(R.drawable.adam_asmaca_5);
            } else if(hata == 5) {
                hata = hata - 1;
                imageView.setImageResource(R.drawable.adam_asmaca_4);
            } else if(hata == 4) {
                hata = hata - 1;
                imageView.setImageResource(R.drawable.adam_asmaca_3);
            } else if(hata == 3) {
                hata = hata - 1;
                imageView.setImageResource(R.drawable.adam_asmaca_2);
            } else if(hata == 2) {
                hata = hata - 1;
                imageView.setImageResource(R.drawable.adam_asmaca_1);
            } else if(hata == 1) {
                buttonOyun.setText("Başlat");
                linearLayoutKelime.removeAllViews();
                imageView.setImageResource(R.drawable.adam_asmaca_7);
                hata = 7;
                Toast.makeText(this, "Oyun bitti, kaybettiniz!", Toast.LENGTH_LONG).show();
            }
        }
    }
}