package com.ersincabuk.mobiluygulamalar.unite5.uyg13;

public class Topcu extends Asker {
    private int atisSayisi;

    public int getAtisSayisi() {
        return atisSayisi;
    }

    public void setAtisSayisi(int atisSayisi) {
        this.atisSayisi = atisSayisi;
    }

    @Override
    public Integer atesEt(Oyuncu dusman) {
        atisSayisi++;
        int hasar = super.atesEt(dusman);
        return hasar;
    }

    public Topcu(Integer atesGucu)
    {
        super(atesGucu, 5);
        atisSayisi = 0;
    }
}
