package jogo;

public class Armadura {
    private int capacete;
    private int peitoral;
    private int calca;
    private int bota;

    public Armadura(int capacete, int peitoral, int calca, int bota ) {
        this.capacete = 20;
        this.peitoral = 40;
        this.calca = 30;
        this.bota = 10;
    }

    public int getCapacete() {
        return capacete;
        int randNum = (int) Math.random(); // 0 >= num > 20
        if (randNum < 20) {
            int dano = dano - randNum;
        }
    }
    public void setCapacete(int capacete) {
        this.capacete = capacete;
    }
    public int getPeitoral() {
        return peitoral;
        int randNum = (int) Math.random(); // 0 >= num > 40
        if (randNum < 40) {
            int dano = dano - randNum;
        }
    }
    public void setPeitoral(int peitoral) {
        this.peitoral = peitoral;
    }
    public int getCalca() {
        return calca;
        int randNum = (int) Math.random(); // 0 >= num > 30
        if (randNum < 30) {
            int dano = dano - randNum;
        }
    }
    public void setCalca(int calca) {
        this.calca = calca;
    }
    public int getBota() {
        return bota;
        int randNum = (int) Math.random(); // 0 >= num > 10
        if (randNum < 10) {
            int dano = dano - randNum;
        }
    }
    public void setBota(int bota) {
        this.bota = bota;
    }
    

    
    

