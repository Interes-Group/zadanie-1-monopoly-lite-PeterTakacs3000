package sk.stuba.fei.uim.oop;

public class PolickoPolicia extends Policko{
    @Override
    public void vykonajAkciu(Hrac hrac) {
        System.out.println(hrac.getMeno() + " bol/-a chyteny/-a policiou, presunie sa na policko 'Vazenie' na 3 kola.");
        hrac.setKolaVoVazeni(3);
        //TODO
        //hrac.setAktualnePolicko();
    }
}
