package sk.stuba.fei.uim.oop;

public class PolickoVazenie extends Policko{
    @Override
    public void vykonajAkciu(Hrac hrac) {
        if(hrac.getKolaVoVazeni() == 0) {
            System.out.println(hrac.getMeno() + " navstivil/-a vazanie.");
        }
        else{
            System.out.println(hrac.getMeno() + " je uvazneni, pocet zostavajucich kol vo vazeni: " + hrac.getKolaVoVazeni());
            hrac.setKolaVoVazeni(hrac.getKolaVoVazeni() - 1);
        }
    }
}
