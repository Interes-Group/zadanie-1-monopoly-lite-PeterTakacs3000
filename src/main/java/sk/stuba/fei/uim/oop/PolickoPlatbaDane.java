package sk.stuba.fei.uim.oop;

public class PolickoPlatbaDane extends Policko{
    @Override
    public void vykonajAkciu(Hrac hrac) {
        System.out.println(hrac.getMeno() + " je na policku 'Platba Dane', musi zaplatit sumu 100.");
        hrac.setPeniaze(hrac.getPeniaze() - 100);
    }
}
