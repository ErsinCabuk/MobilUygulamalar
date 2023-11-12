package com.ersincabuk.mobiluygulamalar.unite5.uyg5;

public class ElektrikliCihaz {
    public String cihazAdi;
    public double cihazGucu;
    public double cihazGunluk;

    //Kilowatt yerine Watt'a çevirdim
    public double aylikKullanim() {
        double aylik = (cihazGucu / 1000) * cihazGunluk * 30;
        return aylik;
    }

    public double ucret() {
        double cihazGucu2 = aylikKullanim();
        double sonuc = 0;
        if(cihazGucu2 > 150) sonuc = (150 * 1.37) + ((cihazGucu2 - 150) * 2.06);
        else sonuc = cihazGucu2 * 1.37;
        return sonuc;
    }
}
