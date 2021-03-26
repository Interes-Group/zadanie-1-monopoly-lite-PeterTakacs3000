package sk.stuba.fei.uim.oop;

public class KartaVypustenieZVazenia extends Karta{
    @Override
    public void vykonajAkciu(Hrac hrac) {
        if(hrac.getKolaVoVazeni() > 0) {
            System.out.println(hrac.getMeno() + " bol prepusteny z vazenia.");
            hrac.setKolaVoVazeni(0);
        }
        else {
            System.out.println(hrac.getMeno() + " zostane na slobode.");
        }
    }
}
