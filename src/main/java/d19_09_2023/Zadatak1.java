package d19_09_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        Tetrapak tetrapak1 = new Tetrapak("328232-2823", "Mleko", 1.0, 1.2, true, 100);
        Tetrapak tetrapak2 = new Tetrapak("123456-7890", "Sok", 0.8, 1.0, false, 150);

        StaklenaAmbalaza flasa1 = new StaklenaAmbalaza(2000, true, 2500);

        StaklenaAmbalaza flasa2 = new StaklenaAmbalaza(2000, false, 1500);



        Korpa korpa = new Korpa();
        korpa.dodajAmbalazu(tetrapak1);
        korpa.dodajAmbalazu(tetrapak2);
        korpa.dodajAmbalazu(flasa1);
        korpa.dodajAmbalazu(flasa2);


        SuperKartica superKartica = new SuperKartica(1234, "Veljko Andjelkovic", 10);


        System.out.println("Ambalaze u korpi:");
        ArrayList<Ambalaza> ambalaze = korpa.ambalaze;
        for (int i = 0; i < ambalaze.size(); i++) {
            Ambalaza ambalaza = ambalaze.get(i);
            ambalaza.stampaj();
            System.out.println("Cena: " + ambalaza.vratiCenuArtikla());
            System.out.println("------------------------");
        }

        double ukupnaCenaSaPopustom = korpa.racunajUkupnuCenuKorpe(superKartica);
        System.out.println("Ukupna cena sa popustom: " + ukupnaCenaSaPopustom);
    }
}



