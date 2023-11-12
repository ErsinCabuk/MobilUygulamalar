package com.ersincabuk.mobiluygulamalar.unite7.uyg2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.ersincabuk.mobiluygulamalar.R;

public class Uyg2Activity extends AppCompatActivity {
    RadioButton radioAcikTema, radioKapaliTema;
    RadioGroup radioGroup;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u7_uyg2_activity);

        radioAcikTema = findViewById(R.id.radioAcikTema);
        radioKapaliTema = findViewById(R.id.radioKapaliTema);
        radioGroup = findViewById(R.id.radioGroup);

        sharedPreferences =  this.getPreferences(Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        String data = sharedPreferences.getString("tema", "acik");
        if(data == "kapali") {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            radioKapaliTema.setChecked(true);
            radioAcikTema.setChecked(false);
        }
        else if(data == "acik") {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            radioAcikTema.setChecked(true);
            radioKapaliTema.setChecked(false);
        }

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch(checkedId)
                {
                    case R.id.radioAcikTema:
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                        editor.putString("tema", "acik");
                        editor.apply();
                        Log.v("TAG", "çalıştım a");
                        break;
                    case R.id.radioKapaliTema:
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                        editor.putString("tema", "kapali");
                        editor.apply();
                        Log.v("TAG", "çalıştım k");
                        break;
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        sharedPreferences = null;
        super.onDestroy();
    }
}