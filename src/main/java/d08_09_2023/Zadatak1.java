package d08_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Proizvod proizvod1 = new Proizvod();
        Proizvod proizvod2 = new Proizvod();

        proizvod1.naziv = "Telefon";
        proizvod2.naziv = "Kompjuter";
        proizvod1.tezinaUGramima = 1000;
        proizvod2.tezinaUGramima = 2500;
        proizvod1.cena = 1200;
        proizvod2.cena = 2000;



        proizvod1.stampaj();
        proizvod1.povecajCenu(100);
        System.out.println("Cena sa popustom: " + proizvod1.vratiCenuSaPopustom(10));
        System.out.println("Postarina: " + proizvod1.racunajPostarinu());

        System.out.println();

        proizvod2.stampaj();
        proizvod2.povecajCenu(50);
        System.out.println("Cena sa popustom: " + proizvod2.vratiCenuSaPopustom(15));
        System.out.println("Postarina: " + proizvod2.racunajPostarinu());
    }
}
