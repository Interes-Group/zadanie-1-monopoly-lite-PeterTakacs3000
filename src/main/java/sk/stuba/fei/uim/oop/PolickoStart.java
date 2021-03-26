package sk.stuba.fei.uim.oop;

public class PolickoStart extends Policko {
    @Override
    public void vykonajAkciu(Hrac hrac) {
        System.out.println(hrac.getMeno() + " presiel/-la jedno kolo, bolo mu pripisana suma 200.");
        int peniaze = hrac.getPeniaze();
        hrac.setPeniaze(peniaze + 200);
    }
}
