package sk.stuba.fei.uim.oop;

public class KartaKradez extends Karta{
    @Override
    public void vykonajAkciu(Hrac hrac) {
        System.out.println("Hraca " + " vykradli, stratil desatinu svojich panazi.");
        hrac.setPeniaze(hrac.getPeniaze() - (hrac.getPeniaze() / 10));
    }
}
