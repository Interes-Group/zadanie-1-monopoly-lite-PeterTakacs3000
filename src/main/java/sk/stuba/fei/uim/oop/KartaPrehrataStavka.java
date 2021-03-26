package sk.stuba.fei.uim.oop;

public class KartaPrehrataStavka extends Karta{
    @Override
    public void vykonajAkciu(Hrac hrac) {
        System.out.println(hrac.getMeno() + " prehral stavku s jeho priatelom, musi zaplatit sumu 100.");
        hrac.setPeniaze(hrac.getPeniaze() - 100);
    }
}
