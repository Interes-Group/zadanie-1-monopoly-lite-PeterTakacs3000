package sk.stuba.fei.uim.oop;

public class PolickoNehnutelnosti extends Policko{
    Hrac vlastnik;

    @Override
    public void vykonajAkciu(Hrac hrac) {
        System.out.print(hrac.getMeno() + " stoji na policku nehnutelnosti, ktoru");
        if(vlastnik != null){
            System.out.println(" nikto nevlastni.");
            char volba = KeyboardInput.readChar("Pre kupu nehnutelnosti za 1000 zadajte 'y' inak zadajte akykolvek iny znak.");
            if (volba == 'y'){
                int peniaze = hrac.getPeniaze();
                hrac.setPeniaze(peniaze - 1000);
                System.out.println(hrac.getMeno() + " uspesne kupil/-a nehnutelnost, nova suma na jeho/jej ucte je " + hrac.getPeniaze());
            } else {
                System.out.println(hrac.getMeno() + " odmietol/-la si kupit nehnutelnost.");
            }
        }
    }
}