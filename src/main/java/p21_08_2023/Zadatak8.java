package p21_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

//        Napisati program koji za sve petocifrene brojeve izvlaci sve cifre i stampa ih na ekranu.
//                Primer izvrsenja:
//        Unesite broj: 19452
//        2, 5, 4, 9, 1

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = s.nextInt();

        if (broj >= 10000 && broj <= 99999) {

            for (int i = 0; i < 5; i++) {
                int cifra = broj % 10;
                System.out.print(cifra + ", ");

                broj = broj / 10;
            }
            System.out.println();
        } else {
            System.out.println("Broj nije petocifren");
        }
    }
}

