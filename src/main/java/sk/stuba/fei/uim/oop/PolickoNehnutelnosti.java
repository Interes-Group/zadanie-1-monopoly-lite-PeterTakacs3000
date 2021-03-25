package sk.stuba.fei.uim.oop;

public class PolickoNehnutelnosti extends Policko{
    Hrac vlastnik;

    @Override
    public void vykonajAkciu(Hrac hrac) {
        System.out.print(hrac.getMeno() + " stoji na policku nehnutelnosti, ktoru");
        if(vlastnik != null){
            System.out.println(" nikto nevlastni.");
            System.out.println("Pre kupu nehnutelnosti za 1000 zadajte 'y'");
        }
    }
}
