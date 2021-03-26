package sk.stuba.fei.uim.oop;

import java.util.ArrayList;
import java.util.Random;

public class PolickoSanca extends Policko{

    private ArrayList<Karta> kartySanca = new ArrayList<>();
    @Override
    public void vykonajAkciu(Hrac hrac) {
        Random rand = new Random();


        kartySanca.add(new KartaKradez());
        kartySanca.add(new KartaPrehrataStavka());
        kartySanca.add(new KartaVyhraStavky());
        kartySanca.add(new KartaVyhraLoterie());
        kartySanca.add(new KartaVypustenieZVazenia());

        Karta vytiahnutaKarta = kartySanca.get(rand.nextInt(4));
        vytiahnutaKarta.vykonajAkciu(hrac);
    }
}
