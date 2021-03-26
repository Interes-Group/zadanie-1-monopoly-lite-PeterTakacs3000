package sk.stuba.fei.uim.oop;

import java.util.Random;

public class Hrac {
    private String meno;
    private int peniaze;
    private int aktualnePolicko;
    private int kocka;
    private int kolaVoVazeni;

    public String getMeno() {
        return meno;
    }

    public int getPeniaze() {
        return peniaze;
    }

    public void setPeniaze(int peniaze) {
        this.peniaze = peniaze;
    }

    public int getKolaVoVazeni() {
        return kolaVoVazeni;
    }

    public void setKolaVoVazeni(int kolaVoVazeni) {
        this.kolaVoVazeni = kolaVoVazeni;
    }

    public int getAktualnePolicko() {
        return aktualnePolicko;
    }

    public void setAktualnePolicko(int aktualnePolicko) {
        this.aktualnePolicko = aktualnePolicko;
    }

    public Hrac(String meno, int peniaze, int aktualnePolicko, int kolaVoVazeni) {
        this.meno = meno;
        this.peniaze = peniaze;
        this.aktualnePolicko = aktualnePolicko;
    }

    public void vypisInfo(){
        System.out.println(this.meno + " je na rade.");
        System.out.println("Jeho peniaze: " + peniaze);
        System.out.println("Hodil kockou " + kocka);
        System.out.println("Stoji na policku c. " + aktualnePolicko + "\n");
    }

    public void hodiKockuAPosunieSa(){
        Random rand = new Random();
        this.kocka = rand.nextInt(5) + 1;
        aktualnePolicko = (aktualnePolicko + this.kocka) % 24;
    }
}
