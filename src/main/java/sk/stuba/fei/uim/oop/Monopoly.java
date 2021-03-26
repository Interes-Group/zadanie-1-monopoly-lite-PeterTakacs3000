package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Monopoly {

    private ArrayList<Hrac> hraci = new ArrayList<>();
    private ArrayList<Policko> policka = new ArrayList<>();

    public void nacitanieHry(){
        for(int i = 0; i < 24; i++){
            switch (i){
                case 0:
                    policka.add(new PolickoStart());
                    break;
                case 5:
                    policka.add(new PolickoVazenie());
                case 11:
                    policka.add(new PolickoPolicia());
                    break;
                case 17:
                    policka.add(new PolickoPlatbaDane());
                case 2:
                case 7:
                case 13:
                case 19:
                    policka.add(new PolickoPlatbaDane());
                    break;
                default:
                    policka.add(new PolickoNehnutelnosti());
                    break;
            }
        }
    }

    public void inicializaciaHracov(){
        boolean nekorektnyPocetHracov = true;
        int pocetHracov = 0;

        while (nekorektnyPocetHracov) {
            pocetHracov = KeyboardInput.readInt("Zadajte pocet hracov (cele cislo v rozsahu 2-6)");
            if ((pocetHracov < 7) && (pocetHracov > 1)) nekorektnyPocetHracov = false;
        }
        for(int i = 0; i < pocetHracov; i++){
            String meno = KeyboardInput.readString("Zadajte meno " + (i+1) + ". hraca");
            Hrac hrac = new Hrac(meno, 10000, 0, 0);
            hraci.add(hrac);
        }

    }

    public void hraj(){
        while (hraci.size() > 1){
            int index = 0;
            for(var hrac : hraci){
                hrac.hodiKockuAPosunieSa();
                hrac.vypisInfo();
                Policko aktualnePolicko = policka.get(hrac.getAktualnePolicko());
                aktualnePolicko.vykonajAkciu(hrac);
                if(hrac.getPeniaze() < 0){
                    hraci.remove(index);
                    index--;
                }
                System.out.println("...");
                index++;
            }
            System.out.println("-------------------------------");
        }
        System.out.println("Vyhral " + hraci.get(0).getMeno());
    }
}
