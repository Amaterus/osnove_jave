package d07_09_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Oprema oprema1 = new Oprema();
        System.out.println("Unesite tip opreme: ");
        oprema1.tip = s.next();

        System.out.println("Unesite marku opreme: ");
        oprema1.marka = s.next();

        System.out.println("Unesite cenu opreme: ");
        oprema1.cena = s.nextDouble();

        Oprema oprema2 = new Oprema();
        System.out.println("Unesite tip opreme: ");
        oprema2.tip = s.next();

        System.out.println("Unesite marku opreme: ");
        oprema2.marka = s.next();

        System.out.println("Unesite cenu opreme: ");
        oprema2.cena = s.nextDouble();

        Oprema oprema3 = new Oprema();
        System.out.println("Unesite tip opreme: ");
        oprema3.tip = s.next();

        System.out.println("Unesite marku opreme: ");
        oprema3.marka = s.next();

        System.out.println("Unesite cenu opreme: ");
        oprema3.cena = s.nextDouble();

        System.out.println("Tip opreme je " + oprema1.tip + ", marka je " + oprema1.marka + " i cena je " + oprema1.cena);
        System.out.println("Tip opreme je " + oprema2.tip + ", marka je " + oprema2.marka + " i cena je " + oprema2.cena);
        System.out.println("Tip opreme je " + oprema3.tip + ", marka je " + oprema3.marka + " i cena je " + oprema3.cena);


    }
}
