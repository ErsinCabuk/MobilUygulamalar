package com.ersincabuk.mobiluygulamalar.unite5.uyg6;

public class Dortgen {
    public int kisaKenar;
    public int uzunKenar;
    public int alanBul(){
        return kisaKenar * uzunKenar;
    }

    public Dortgen(int kenar) {
        this.kisaKenar = kenar;
        this.uzunKenar = kenar;
    }

    public Dortgen(int kisaKenar, int uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }
}
