package p18_08_2023;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

//        Napisati program koji od korisnika ucitava 2 cela broja A i B . Program stampa sve brojeve od 1 do 10 osim brojeva A i B. Smatramo da korisnik unosi vrednosti od 1 do 10 za A i B vrednosti.
//                Primer izvrsenja:
//        Unesite a: 3
//        Uneiste b: 5
//        1, 2, 4, 6, 7, 8, 9, 10 => (objasnjenje: 3 i 5 nisu odstampani)

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite A: ");
        int A = s.nextInt();
        System.out.print("Unesite B: ");
        int B = s.nextInt();

        if (A < 1 || A > 10 || B < 1 || B > 10) {
            System.out.println("Neispravan unos. A i B moraju biti izmedju 1 i 10.");

        }
        for (int i = 1; i <= 10; i++) {

            if (i != A && i != B) {

                System.out.print(i + ", ");
            }
        }
    }
}

