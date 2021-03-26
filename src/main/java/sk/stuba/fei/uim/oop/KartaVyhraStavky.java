package sk.stuba.fei.uim.oop;

public class KartaVyhraStavky extends Karta{
    @Override
    public void vykonajAkciu(Hrac hrac) {
        System.out.println(hrac.getMeno() + " vyhral stavku s priatelom, jeho ucet bol zvyseny o sumu 100.");
        hrac.setPeniaze(hrac.getPeniaze() + 100);
    }
}
