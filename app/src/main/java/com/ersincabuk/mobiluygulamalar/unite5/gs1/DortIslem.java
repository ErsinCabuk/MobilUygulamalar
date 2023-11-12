package com.ersincabuk.mobiluygulamalar.unite5.gs1;

public class DortIslem {
    public int sonuc;

    public DortIslem(int sayi1, int sayi2, String islem) {
        switch (islem) {
            case "+":
                this.sonuc = sayi1+sayi2;
                break;
            case "-":
                this.sonuc = sayi1-sayi2;
                break;
            case "/":
                this.sonuc = sayi1/sayi2;
                break;
            case "*":
                this.sonuc = sayi1*sayi2;
                break;
        }
    }
}
