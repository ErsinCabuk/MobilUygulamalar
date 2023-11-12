package com.ersincabuk.mobiluygulamalar.unite7.uyg3_uyg4_uyg5_uyg6;

public class Urun {
    int id;
    String ad, adet, fiyat;
    byte[] resim;

    public Urun(int id, String ad, String adet, String fiyat, byte[] resim) {
        this.id = id;
        this.ad = ad;
        this.adet = adet;
        this.fiyat = fiyat;
        this.resim = resim;
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getAdet() {
        return adet;
    }

    public String getFiyat() {
        return fiyat;
    }

    public byte[] getResim() {
        return resim;
    }
}
