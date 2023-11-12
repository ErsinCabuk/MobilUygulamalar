package com.ersincabuk.mobiluygulamalar.unite3.uyg12;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg12Activity extends AppCompatActivity {
    private final String TAG = "Etiket";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u3_bir_sayili_activity);

        EditText txtSayi = findViewById(R.id.txtSayi);
        TextView txtViewBilgi = findViewById(R.id.txtViewBilgi);

        Button btnCalistir = findViewById(R.id.btnCalistir);
        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi = Integer.parseInt(txtSayi.getText().toString());

                Log.i(TAG, "Düğmeye tıklandı");

                EditText editText = (EditText) findViewById(R.id.txtSayi);
                Log.i(TAG, "Edit Text tanımlandı.");

                String s = editText.getText().toString();
                Log.i(TAG, "Edit Text içindeki yazı alındı.");

                try {
                    sayi = Integer.parseInt(s);
                    Log.i(TAG, "Yazı sayıya çevrildi.");
                } catch(Exception e) {
                    Log.e(TAG,"Çevirme hatası.");
                    sayi = 0;
                } finally {
                    sayi = sayi + 2;
                    Log.i(TAG, "(finally) sayı= " + sayi);
                }

                txtViewBilgi.setText("Logcat'i kontrol edin.");
            }
        });
    }
}
