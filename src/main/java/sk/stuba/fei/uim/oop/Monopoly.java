package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Monopoly {

    private ArrayList<Hrac> hraci = new ArrayList<>();

    public void inicializaciaHracov(){
        boolean nekorektnyPocetHracov = true;
        int pocetHracov = 0;

        while (nekorektnyPocetHracov) {
            pocetHracov = KeyboardInput.readInt("Zadajte pocet hracov (cele cislo v rozsahu 2-6)");
            if ((pocetHracov < 7) && (pocetHracov > 1)) nekorektnyPocetHracov = false;
        }
        for(int i = 0; i < pocetHracov; i++){
            String meno = KeyboardInput.readString("Zadajte meno " + (i+1) + ". hraca");
            Hrac hrac = new Hrac(meno, 10000, 0);
            hraci.add(hrac);
        }

    }

    public void hraj(){
        int i = 10;
        while (i != 0){   //hraci.size() > 1
            for(var hrac : hraci){
                hrac.hodiKockuAPosunieSa();
                hrac.vypisInfo();
                i--;
            }
            System.out.println("-------------------------------");
        }
    }
}