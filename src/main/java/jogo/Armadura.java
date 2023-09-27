package jogo;
import java.lang.Math
;

public class Armadura {
    private int capacete;
    private int peitoral;
    private int calca;
    private int bota;

    public Armadura() {
        this.capacete = 20;
        this.peitoral = 40;
        this.calca = 30;
        this.bota = 10;
    }

    public Armadura(String string) {
    }

    public int getCapacete() {
        return (int) Math.random() * capacete;
    }

    public void setCapacete(int capacete) {
        this.capacete = capacete;
    }

    public int getPeitoral() {
        return (int) Math.random() * peitoral;
    }

    public void setPeitoral(int peitoral) {
        this.peitoral = peitoral;
    }

    public int getCalca() {
        return (int) Math.random() * calca;
    }

    public void setCalca(int calca) {
        this.calca = calca;
    }

    public int getBota() {
        return (int) Math.random() * bota;
    }

    public void setBota(int bota) {
        this.bota = bota;
    }
}

    
    

