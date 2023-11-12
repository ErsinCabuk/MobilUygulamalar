package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.FeatureGroupInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    TextView textViewHepsi, textViewSayi;
    Boolean yapildi = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewHepsi = findViewById(R.id.textViewHepsi);
        textViewSayi = findViewById(R.id.textViewSayi);
    }

    public void buttonHepsiniSil(View view) {
        textViewHepsi.setText("");
        textViewSayi.setText("");
    }

    public void buttonSil(View view) {
        textViewSayi.setText("");
    }

    public void buttonNokta(View view) {
        if(textViewSayi.getText().toString().isEmpty()) Toast.makeText(this, "Sayı girin.", Toast.LENGTH_SHORT).show();
        else textViewSayi.setText(textViewSayi.getText().toString() + ".");
    }

    public void buttonSayilar(View view) {
        if(yapildi) {
            textViewHepsi.setText("");
            textViewSayi.setText("");
            yapildi = false;
        }

        Button buttonSayi = (Button) view;
        textViewSayi.setText(textViewSayi.getText().toString() + buttonSayi.getText().toString());
    }

    public void buttonIslemler(View view) {
        if(yapildi) {
            textViewHepsi.setText("");
            textViewSayi.setText("");
            yapildi = false;
        }

        if(textViewSayi.getText().toString().isEmpty()) Toast.makeText(this, "Sayı girin.", Toast.LENGTH_SHORT).show();
        else {
            Button buttonIslem = (Button) view;
            textViewHepsi.setText(textViewHepsi.getText().toString() + textViewSayi.getText().toString() + " " + buttonIslem.getText().toString() + " ");
            textViewSayi.setText("");
        }
    }

    public void buttonHesapla(View view) {
        if(yapildi) {
            textViewHepsi.setText("");
            textViewSayi.setText("");
            yapildi = false;
        }
        if(textViewSayi.getText().toString().endsWith(".")) Toast.makeText(this, "Doğru bir sayı girin.", Toast.LENGTH_SHORT).show();
        else if(textViewHepsi.getText().toString().isEmpty()) Toast.makeText(this, "Hesaplanacak hiç bir şey yok.", Toast.LENGTH_SHORT).show();
        else {
            String islem = textViewHepsi.getText().toString() + textViewSayi.getText().toString();
            Log.i("islem: ", islem);
            String sonuc = hesapla(islem);
            textViewHepsi.setText(islem + " =");
            textViewSayi.setText(String.valueOf(sonuc));
            yapildi = true;
        }
    }

    public String hesapla(String islem) {
        String[] parcalar = islem.split(" ");

        Stack<Double> sayilar = new Stack<>();
        Stack<String> operatorler = new Stack<>();

        for(String parca : parcalar) {
            if(parca.matches("-?\\d+(\\.\\d+)?")) sayilar.push(Double.parseDouble(parca));
            else if(operatorMu(parca)) {
                while (!operatorler.empty() && operatorOncelik(operatorler.peek()) >= operatorOncelik(parca)) {
                    double sayi2 = sayilar.pop();
                    double sayi1 = sayilar.pop();
                    String operator = operatorler.pop();
                    double sonuc = islemYap(operator, sayi1, sayi2);
                    sayilar.push(sonuc);
                }
                operatorler.push(parca);
            }
        }

        while (!operatorler.empty()) {
            double sayi2 = sayilar.pop();
            double sayi1 = sayilar.pop();
            String operator = operatorler.pop();
            double sonuc = islemYap(operator, sayi1, sayi2);
            sayilar.push(sonuc);
        }

        if(sayilar.peek().isNaN()) {
            return "HATA";
        }

        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(sayilar.pop());
    }

    public static boolean operatorMu(String string) {
        return string.equals("+") || string.equals("-") || string.equals("x") || string.equals("/");
    }

    public static int operatorOncelik(String operator) {
        if (operator.equals("x") || operator.equals("/")) {
            return 2;
        } else if (operator.equals("x") || operator.equals("-")) {
            return 1;
        }
        return 0;
    }

    public static double islemYap(String operator, double sayi1, double sayi2) {
        switch (operator) {
            case "+":
                return sayi1 + sayi2;
            case "-":
                return sayi1 - sayi2;
            case "x":
                return sayi1 * sayi2;
            case "/":
                return sayi1 / sayi2;
            default:
                return 0.0;
        }
    }

}