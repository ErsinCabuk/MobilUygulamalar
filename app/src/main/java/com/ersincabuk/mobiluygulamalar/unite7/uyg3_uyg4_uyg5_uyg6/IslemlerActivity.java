package com.ersincabuk.mobiluygulamalar.unite7.uyg3_uyg4_uyg5_uyg6;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.ersincabuk.mobiluygulamalar.R;

import java.io.ByteArrayOutputStream;

public class IslemlerActivity extends AppCompatActivity {
    SQLiteDatabase database;
    EditText editTextAd, editTextFiyat, editTextAdet;
    ImageView imageViewUrun;

    int id;
    ActivityResultLauncher<Intent> galleryLauncher;
    ActivityResultLauncher<String> galleryPermission;
    Bitmap bitmap;

    String mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u7_uyg3_islemler_activity);

        editTextAd = findViewById(R.id.editTextAd);
        editTextFiyat = findViewById(R.id.editTextFiyat);
        editTextAdet = findViewById(R.id.editTextAdet);
        imageViewUrun = findViewById(R.id.imageViewUrun);

        Intent i = getIntent();
        mod = i.getStringExtra("mod");

        if(mod.equals("duzenle")) {
            Button buttonSil = findViewById(R.id.buttonSil);

            id = i.getIntExtra("id", 0);
            String ad = i.getStringExtra("ad");
            String adet = i.getStringExtra("adet");
            String fiyat = i.getStringExtra("fiyat");
            byte[] resim = i.getByteArrayExtra("resim");

            editTextAd.setText(ad);
            editTextFiyat.setText(fiyat);
            editTextAdet.setText(adet);
            buttonSil.setVisibility(View.VISIBLE);

            bitmap = BitmapFactory.decodeByteArray(resim, 0, resim.length);
            imageViewUrun.setImageBitmap(bitmap);
        }

        database = openOrCreateDatabase("MobilUygulamalar", MODE_PRIVATE, null);
        database.execSQL("create table if not exists urunler (id integer primary key, ad text, adet text, fiyat text, resim blob)");

        registerLauncher();
    }

    public void buttonKaydet(View view) {
        if(mod.equals("duzenle")) {
            SQLiteStatement sorgu = database.compileStatement("update urunler set ad = ?, adet = ?, fiyat = ?, resim = ? where id = ?");
            sorgu.bindString(1, editTextAd.getText().toString());
            sorgu.bindString(2, editTextAdet.getText().toString());
            sorgu.bindString(3, editTextFiyat.getText().toString());
            if (bitmap == null) {
                Drawable drawable = imageViewUrun.getDrawable();
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                Bitmap kucukResim = resimKucultucu(bitmap);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                kucukResim.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] bytes = byteArrayOutputStream.toByteArray();
                sorgu.bindBlob(4, bytes);
            } else {
                Bitmap kucukResim = resimKucultucu(bitmap);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                kucukResim.compress(Bitmap.CompressFormat.PNG, 50, byteArrayOutputStream);
                byte[] bytes = byteArrayOutputStream.toByteArray();
                sorgu.bindBlob(4, bytes);
            }
            sorgu.bindLong(5, id);
            sorgu.execute();

            UygActivity uyg3 = new UygActivity();
            uyg3.finish();
            finish();
            Intent i = new Intent(this, UygActivity.class);
            startActivity(i);
        } else if(mod.equals("yeni")) {
            SQLiteStatement sorgu = database.compileStatement("insert into urunler (ad, adet, fiyat, resim) values (?, ?, ?, ?)");
            sorgu.bindString(1, editTextAd.getText().toString());
            sorgu.bindString(2, editTextAdet.getText().toString());
            sorgu.bindString(3, editTextFiyat.getText().toString());
            if (bitmap == null) {
                Drawable drawable = imageViewUrun.getDrawable();
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                Bitmap kucukResim = resimKucultucu(bitmap);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                kucukResim.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] bytes = byteArrayOutputStream.toByteArray();
                sorgu.bindBlob(4, bytes);
            } else {
                Bitmap kucukResim = resimKucultucu(bitmap);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                kucukResim.compress(Bitmap.CompressFormat.PNG, 50, byteArrayOutputStream);
                byte[] bytes = byteArrayOutputStream.toByteArray();
                sorgu.bindBlob(4, bytes);
            }
            sorgu.execute();

            UygActivity uyg3 = new UygActivity();
            uyg3.finish();
            finish();
            Intent i = new Intent(this, UygActivity.class);
            startActivity(i);
        }
    }

    public void buttonSil(View view) {
        SQLiteStatement sorgu = database.compileStatement("delete from urunler where id = ?");
        sorgu.bindLong(1, id);
        sorgu.execute();
        Toast.makeText(this, "Silindi.", Toast.LENGTH_SHORT).show();

        UygActivity uyg3 = new UygActivity();
        uyg3.finish();
        finish();
        Intent i = new Intent(this, UygActivity.class);
        startActivity(i);
    }

    public void buttonResimEkle(View view) {
        Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        galleryLauncher.launch(i);
    }

    public Bitmap resimKucultucu(Bitmap image) {
        int maxSize = 256;
        int width = image.getWidth();
        int height = image.getHeight();
        float scale;

        if (width > height) {
            scale = (float) maxSize / (float) width;
        } else if (height > width) {
            scale = (float) maxSize / (float) height;
        } else {
            scale = (float) maxSize / (float) width;
        }

        Matrix matrix = new Matrix();
        matrix.postScale(scale, scale);
        return Bitmap.createBitmap(image, 0, 0, width, height, matrix, true);
    }

    public void registerLauncher() {
        galleryLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode()==RESULT_OK){
                    Intent i=result.getData();
                    if(i != null){
                        Uri galleryUri=i.getData();
                        try {
                            if(Build.VERSION.SDK_INT>=28) {
                                ImageDecoder.Source source=ImageDecoder.createSource(getContentResolver(),galleryUri);
                                bitmap = ImageDecoder.decodeBitmap(source);
                                imageViewUrun.setImageBitmap(bitmap);
                            } else {
                                bitmap=MediaStore.Images.Media.getBitmap(getContentResolver(),galleryUri);
                                imageViewUrun.setImageBitmap(bitmap);
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        galleryPermission = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback<Boolean>() {
            @Override
            public void onActivityResult(Boolean result) {
                if(result){
                    Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    galleryLauncher.launch(i);
                } else {
                    Toast.makeText(IslemlerActivity.this, "İzin ver", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}