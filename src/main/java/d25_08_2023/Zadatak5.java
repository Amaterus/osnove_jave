package d25_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite iznos u evrima: ");
        double iznosUEvrima = s.nextDouble();

        System.out.print("Unesite ciljnu valutu (RSD/USD/RUB): ");
        String ciljnaValuta = s.next();

        double konvertovanIznos = konvertujValutu(iznosUEvrima, ciljnaValuta);

        if (konvertovanIznos > 0) {
            System.out.println(iznosUEvrima + " EUR je " + konvertovanIznos + " " + ciljnaValuta);
            prikaziKursneStope();
        }
    }

    public static double konvertujValutu(double iznosUEvrima, String ciljnaValuta) {
        double kursKonverzije = 0.0;

        if (ciljnaValuta.equals("RSD")) {
            kursKonverzije = 117.5;
        } else if (ciljnaValuta.equals("USD")) {
            kursKonverzije = 1.1;
        } else if (ciljnaValuta.equals("RUB")) {
            kursKonverzije = 62.98;
        } else {
            System.out.println("Nepodrzana valuta!");
        }

        return iznosUEvrima * kursKonverzije;
    }

    public static void prikaziKursneStope() {
        System.out.println("Konverzija evra u druge valute:");
        System.out.println("1 EUR = 117.5 RSD");
        System.out.println("1 EUR = 1.1 USD");
        System.out.println("1 EUR = 62.98 RUB");
    }
}

