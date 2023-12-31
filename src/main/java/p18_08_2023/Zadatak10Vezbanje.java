package p18_08_2023;

import java.util.Scanner;

public class Zadatak10Vezbanje {
    public static void main(String[] args) {

//        Napisati program koji stampa 20 pozicija.
//                Za aktivnu poziciju stampa *
//                Za neaktivnu pozciju stampa _
//        Korisnik unosi granice za nekativni opseg, unoseci A i B.
//                Primer izvrsenja:
//        Unesite a: 5
//        Unesite b: 10
//                * * * * _ _ _ _ _ _ * * * * * * * * * *
//        Objasnjenje: stampamo _ od 5 do 10 u ostalim situacijama stampamo *


        Scanner s = new Scanner(System.in);

        System.out.print("Unesite A: ");
        int a = s.nextInt();
        System.out.print("Unesite B: ");
        int b = s.nextInt();

        if (a < 1 || a > 20 || b < 1 || b > 20) {
            System.out.println("Neispravan unos. A i B moraju biti izmedju 1 i 20.");
        }

        for (int i = 1; i <= 20; i++) {
            if (i >= a && i <= b) {
                System.out.print("_ ");
            } else {
                System.out.print("* ");
            }
        }

        System.out.println();
    }
}
