package com.ersincabuk.mobiluygulamalar.unite6.ss247;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ersincabuk.mobiluygulamalar.R;

import java.util.ArrayList;

public class SS247Activity extends AppCompatActivity {
    ImageView imageView;
    TextView txtViewBilgi;
    ArrayList<BilimInsanlari> bilimInsalariList;
    int seciliSiraNo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u6_ss247_activity);

        imageView = findViewById(R.id.imageUrun);
        txtViewBilgi = findViewById(R.id.txtViewBilgi);

        bilimInsalariList = new ArrayList<>();

        BilimInsanlari bilimInsani1 = new BilimInsanlari("8 Eylül 1946", "Aziz Sancar", "Aziz Sancar, Türk doktor, akademisyen, biyokimyager ve moleküler biyologtur.", 0, R.drawable.u6_ss247_azizsancar);
        BilimInsanlari bilimInsani2 = new BilimInsanlari("24 Ekim 2010", "Cahit Arf", "Cahit Arf, Türk matematikçi ve bilim insanı, eski TÜBİTAK Bilim Kolu başkanıdır. ", 0, R.drawable.u6_ss247_cahitarf);
        BilimInsanlari bilimInsani3 = new BilimInsanlari("1403", "Ali Kuşçu", "Ali Kuşçu veya asıl adıyla Ali bin Muhammed, Timur İmparatorluğu ile Osmanlı İmparatorluğu'nda yaşamış olan astronom, matematikçi, fizikçi, filozof ve dil bilimcidir.", 0, R.drawable.u6_ss247_alikuscu);
        BilimInsanlari bilimInsani4 = new BilimInsanlari("?", "Pîrî Reis", "Pîrî Reis, Osmanlı Türk'ü denizci ve kartograf. Asıl adı Muhyiddin Pîrî Bey'dir.", 0, R.drawable.u6_ss247_pirireis);
        BilimInsanlari bilimInsani5 = new BilimInsanlari("29 Kasım 1908", "Afet İnan", "Ayşe Âfet İnan, Türk sosyolog, tarihçi ve akademisyen.", 0, R.drawable.u6_ss247_afetinan);

        bilimInsalariList.add(bilimInsani1);
        bilimInsalariList.add(bilimInsani2);
        bilimInsalariList.add(bilimInsani3);
        bilimInsalariList.add(bilimInsani4);
        bilimInsalariList.add(bilimInsani5);

        imageView.setImageResource(bilimInsalariList.get(0).foto);
        txtViewBilgi.setText("Ad: " + bilimInsalariList.get(0).ad + "\n\nDoğum Tarihi: " + bilimInsalariList.get(0).dogumTarihi + "\n\nHakkında: " + bilimInsalariList.get(0).hakkinda);
        seciliSiraNo = 0;
    }

    public void btnIleri(View view){
        if(seciliSiraNo < bilimInsalariList.size() - 1) seciliSiraNo++;
        else seciliSiraNo = 0;

        imageView.setImageResource(bilimInsalariList.get(seciliSiraNo).foto);
        txtViewBilgi.setText("Ad: " + bilimInsalariList.get(seciliSiraNo).ad + "\n\nDoğum Tarihi: " + bilimInsalariList.get(seciliSiraNo).dogumTarihi + "\n\nHakkında: " + bilimInsalariList.get(seciliSiraNo).hakkinda);
    }

    public void btnGeri(View view){
        if(seciliSiraNo > 0) seciliSiraNo--;
        else seciliSiraNo = bilimInsalariList.size() - 1;

        imageView.setImageResource(bilimInsalariList.get(seciliSiraNo).foto);
        txtViewBilgi.setText("Ad: " + bilimInsalariList.get(seciliSiraNo).ad + "\n\nDoğum Tarihi: " + bilimInsalariList.get(seciliSiraNo).dogumTarihi + "\n\nHakkında: " + bilimInsalariList.get(seciliSiraNo).hakkinda);
    }
}
