package com.ersincabuk.mobiluygulamalar.unite3.uyg8;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg8Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u3_bir_sayili_activity);

        EditText txtSayi = findViewById(R.id.txtSayi);
        TextView txtViewCalistir = findViewById(R.id.txtViewBilgi);

        Button btnCalistir = findViewById(R.id.btnCalistir);
        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi = Integer.parseInt(txtSayi.getText().toString());

                txtViewCalistir.setText("x = " + sayi);
                sayi += 3;
                txtViewCalistir.setText(txtViewCalistir.getText().toString() + "\nx += 3: " +  sayi);
                sayi -= 2;
                txtViewCalistir.setText(txtViewCalistir.getText().toString() + "\nx -= 2: " +  sayi);
                sayi *= 2;
                txtViewCalistir.setText(txtViewCalistir.getText().toString() + "\nx *= 2: " +  sayi);
                sayi /= 4;
                txtViewCalistir.setText(txtViewCalistir.getText().toString() + "\nx /= 4: " +  sayi);
                sayi %= 2;
                txtViewCalistir.setText(txtViewCalistir.getText().toString() + "\nx %= 2: " +  sayi);
            }
        });
    }
}
