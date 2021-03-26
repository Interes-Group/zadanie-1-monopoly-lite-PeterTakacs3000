package sk.stuba.fei.uim.oop;

public class KartaVyhraLoterie extends Karta{
    @Override
    public void vykonajAkciu(Hrac hrac) {
        System.out.println(hrac.getMeno() + " vyhral loteriu, na jeho ucet bola pripisana suma 10000.");
        hrac.setPeniaze(hrac.getPeniaze() + 10000);
    }
}
