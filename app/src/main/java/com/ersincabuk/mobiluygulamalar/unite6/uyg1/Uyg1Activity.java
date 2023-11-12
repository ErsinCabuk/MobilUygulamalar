package com.ersincabuk.mobiluygulamalar.unite6.uyg1;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ersincabuk.mobiluygulamalar.R;

import java.util.ArrayList;

public class Uyg1Activity extends AppCompatActivity {
    ImageView imageView;
    TextView txtViewBilgi;
    ArrayList<Gorsel> bilimInsalariList;
    int seciliSiraNo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u6_uyg1_activity);

        imageView = findViewById(R.id.imageUrun);
        txtViewBilgi = findViewById(R.id.txtViewBilgi);

        bilimInsalariList = new ArrayList<>();

        Gorsel saturn = new Gorsel("Saturn", 1, R.drawable.u6_uyg1_saturn);
        Gorsel jupiter = new Gorsel("Jupiter", 2, R.drawable.u6_uyg1_jupiter);
        Gorsel uranus = new Gorsel("Uranus", 3 ,R.drawable.u6_uyg1_uranus);

        bilimInsalariList.add(saturn);
        bilimInsalariList.add(jupiter);
        bilimInsalariList.add(uranus);

        imageView.setImageResource(bilimInsalariList.get(0).foto);
        txtViewBilgi.setText("Bilgi: " + bilimInsalariList.get(0).bilgi);
        seciliSiraNo = 0;
    }

    public void btnIleri(View view){
        if(seciliSiraNo < bilimInsalariList.size() - 1){
            seciliSiraNo++;
            imageView.setImageResource(bilimInsalariList.get(seciliSiraNo).foto);
            txtViewBilgi.setText("Bilgi: " + bilimInsalariList.get(seciliSiraNo).bilgi);
        } else {
            seciliSiraNo = 0;
            imageView.setImageResource(bilimInsalariList.get(seciliSiraNo).foto);
            txtViewBilgi.setText("Bilgi: " + bilimInsalariList.get(seciliSiraNo).bilgi);
        }
    }

    public void btnGeri(View view){
        if(seciliSiraNo > 0){
            seciliSiraNo--;
            imageView.setImageResource(bilimInsalariList.get(seciliSiraNo).foto);
            txtViewBilgi.setText("Bilgi: " + bilimInsalariList.get(seciliSiraNo).bilgi);
        } else {
            seciliSiraNo = bilimInsalariList.size() - 1;
            imageView.setImageResource(bilimInsalariList.get(seciliSiraNo).foto);
            txtViewBilgi.setText("Bilgi: " + bilimInsalariList.get(seciliSiraNo).bilgi);
        }
    }
}
