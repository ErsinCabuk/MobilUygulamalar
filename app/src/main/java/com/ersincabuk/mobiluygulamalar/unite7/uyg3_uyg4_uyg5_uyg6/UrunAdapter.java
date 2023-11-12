package com.ersincabuk.mobiluygulamalar.unite7.uyg3_uyg4_uyg5_uyg6;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ersincabuk.mobiluygulamalar.R;

import java.util.ArrayList;

public class UrunAdapter extends BaseAdapter {
    Context context;
    ArrayList<Urun> urunler;

    public UrunAdapter(Context context, ArrayList<Urun> urunler) {
        this.context = context;
        this.urunler = urunler;
    }

    @Override
    public int getCount() {
        return urunler.size();
    }

    @Override
    public Object getItem(int i) {
        return urunler.get(i);
    }

    @Override
    public long getItemId(int i) {
        return urunler.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.u7_uyg3_list_satir, viewGroup, false);
        }

        TextView textViewAd = view.findViewById(R.id.textViewAd),
                 textViewFiyat = view.findViewById(R.id.textViewFiyat),
                 textViewAdet = view.findViewById(R.id.textViewAdet);
        ImageView imageViewUrun = view.findViewById(R.id.imageViewUrun);

        Urun urun = urunler.get(i);
        textViewAd.setText(urun.getAd());
        textViewFiyat.setText(urun.getFiyat());
        textViewAdet.setText(urun.getAdet());
        if(urun.getResim() == null || urun.getResim().length == 0) imageViewUrun.setImageResource(R.drawable.u7_uyg3_resim_yok);
        else {
            Bitmap bitmap = BitmapFactory.decodeByteArray(urun.getResim(), 0, urun.getResim().length);
            imageViewUrun.setImageBitmap(bitmap);
        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, IslemlerActivity.class);
                i.putExtra("id", urun.getId());
                i.putExtra("mod", "duzenle");
                i.putExtra("ad", urun.getAd());
                i.putExtra("adet", urun.getAdet());
                i.putExtra("fiyat", urun.getFiyat());
                i.putExtra("resim", urun.getResim());
                context.startActivity(i);
            }
        });

        return view;
    }
}
