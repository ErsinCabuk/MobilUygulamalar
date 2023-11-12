package com.ersincabuk.mobiluygulamalar.unite5.uyg13;

public class Oyuncu {
    private String isim;
    private Integer can;
    private Integer topcuAG = 3;
    private Integer tankciAG = 5;

    public void setTankciAG(Integer tankciAG) {
        this.tankciAG = tankciAG;
    }

    public Oyuncu(String isim, Integer can, Integer topcuAG, Integer tankciAG) {
        this.isim = isim;
        this.can = can;
        this.topcuAG = topcuAG;
        this.tankciAG = tankciAG;
    }

    public void setTopcuAG(Integer topcuAG) {
        this.topcuAG = topcuAG;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Integer getCan() {
        return can;
    }

    public void setCan(Integer can) {
        this.can = can;
    }

    public Asker tankci = new Tankci(tankciAG);
    public Asker topcu = new Topcu(topcuAG);
}

