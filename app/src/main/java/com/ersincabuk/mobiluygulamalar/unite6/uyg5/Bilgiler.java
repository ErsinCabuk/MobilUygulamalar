package com.ersincabuk.mobiluygulamalar.unite6.uyg5;

import java.io.Serializable;

public class Bilgiler implements Serializable {
    private String adiSoyadi;
    private String sifre;
    private String eposta;

    public Bilgiler(String adiSoyadi, String sifre, String eposta){
        this.adiSoyadi = adiSoyadi;
        this.eposta = eposta;
        this.sifre = sifre;
    }

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public String getSifre() {
        return sifre;
    }

    public String getEposta() {
        return eposta;
    }
}
