package com.ersincabuk.mobiluygulamalar.unite5.ss188;

public class Ucgen {
    public int birKenar;
    public int ikiKenar;
    public int ucKenar;
    public int cevreBul() {
        return birKenar + ikiKenar + ucKenar;
    }

    public Ucgen(int birKenar) { //Eşkenar
        this.birKenar = birKenar;
        this.ikiKenar = birKenar;
        this.ucKenar = birKenar;
    }

    public Ucgen(int birKenar, int ikiKenar) {//İkizkenar
        this.birKenar = birKenar;
        this.ikiKenar = ikiKenar;
        this.ucKenar = ikiKenar;
    }

    public Ucgen(int birKenar, int ikiKenar, int ucKenar) {//Ückenar
        this.birKenar = birKenar;
        this.ikiKenar = ikiKenar;
        this.ucKenar = ucKenar;
    }
}
