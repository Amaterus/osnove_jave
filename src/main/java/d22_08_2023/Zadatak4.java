package d22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//                Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:0
//        Unesite broj:2
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto dve dvojke)
//
//        Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:1
//        Unesite broj:3
//        Unesite broj:1
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto tri jedinice)

        Scanner scanner = new Scanner(System.in);
        int brojJedinica = 0;
        int brojDvojki = 0;

        while (true) {
            System.out.print("Unesite broj: ");
            int unos = scanner.nextInt();

            if (unos == 1) {
                brojJedinica++;
                brojDvojki = 0;
            } else if (unos == 2) {
                brojDvojki++;
                brojJedinica = 0;
            } else {
                brojJedinica = 0;
                brojDvojki = 0;
            }

            if (brojJedinica >= 3 || brojDvojki >= 2) {
                System.out.println("Kraj programa.");
            }
        }
    }
}
