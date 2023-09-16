package d15_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
        Igrac igrac = new Igrac("Veljko Andjelkovic", "123456789", 2000, 7, "Centar", true);

        if (igrac != null) {
            igrac.dodajKarton(new Karton("zuti"));
            igrac.dodajKarton(new Karton("crveni"));
            igrac.dodajKarton(new Karton("zuti"));
        }

        System.out.println("Broj zutih kartona: " + igrac.brojZutih());
        System.out.println("Broj crvenih kartona: " + igrac.brojCrvenih());

        igrac.stampaj();
    }
}
