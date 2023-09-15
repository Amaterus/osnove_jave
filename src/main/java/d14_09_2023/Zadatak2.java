package d14_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        {
            Kombinacija kombinacija1 = new Kombinacija("Kombinacija 1", 1, 3, 5, 14, 15, 21, 23);
            Kombinacija kombinacija2 = new Kombinacija("Kombinacija 2", 2, 4, 6, 8, 10, 12, 14);
            Kombinacija kombinacija3 = new Kombinacija("Kombinacija 3", 7, 9, 11, 13, 15, 17, 19);

            Listic listic = new Listic();
            listic.dodajKombinaciju(kombinacija1);
            listic.dodajKombinaciju(kombinacija2);
            listic.dodajKombinaciju(kombinacija3);

            Kombinacija dobitnaKombinacija = new Kombinacija("Dobitna kombinacija", 1, 3, 5, 14, 15, 21, 23);

            listic.stampaj();

            if (listic.dobitna(dobitnaKombinacija)) {
                System.out.println("Dobitna kombinacija je pronadjena!");
            } else {
                System.out.println("Dobitna kombinacija nije pronadjena.");
            }
        }
    }
}
