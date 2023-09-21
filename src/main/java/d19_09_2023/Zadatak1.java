package d19_09_2023;


public class Zadatak1 {
    public static void main(String[] args) {

        Tetrapak tetrapak1 = new Tetrapak("328232-2823", "Mleko", 1.0, 1.2, true, 100);
        Tetrapak tetrapak2 = new Tetrapak("123456-7890", "Sok", 0.8, 1.0, false, 150);

        StaklenaAmbalaza flasa1 = new StaklenaAmbalaza("328232-2823", "Koka Kola", 1.0, 0.8, 0, false, 200);

        StaklenaAmbalaza flasa2 = new StaklenaAmbalaza("328232-4343", "Fanta", 1.0, 0.8, 50, true, 180);


        Korpa korpa = new Korpa();
        korpa.dodajAmbalazu(tetrapak1);
        korpa.dodajAmbalazu(tetrapak2);
        korpa.dodajAmbalazu(flasa1);
        korpa.dodajAmbalazu(flasa2);


        SuperKartica superKartica = new SuperKartica(1234, "Veljko Andjelkovic", 10);

        double ukupnaCenaSaPopustom = korpa.racunajUkupnuCenuKorpe(superKartica);
        System.out.println("Ukupna cena sa popustom: " + ukupnaCenaSaPopustom);
    }
}



