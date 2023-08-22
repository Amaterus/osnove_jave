package p21_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

//        (ZA VEZBANJE)Napisati program koji od korisnika ucitava N jednocifrenih brojeva i od njih formira rezultujuci broj kao na primeru
//        Unesite N: 5
//        Unesite broj: 1 => 1
//        Unesite broj: 2 => 12
//        Unesite broj: 0 => 120
//        Unesite broj: 4 …
//        Unesite broj: 1
//        Rezultujuci broj je 12041 (Promenljiva tipa int)
//
//        a = 1
//        b = 3
//        c = a * 10 + b => 10 + 3 => 13


        Scanner s = new Scanner(System.in);

        int rezultat = 0;
        System.out.println("Unesite N:");

        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if (broj >= 0 && broj <= 9) {

                rezultat = rezultat * 10 + broj;
            } else {

                System.out.println("Greska: Broj nije jednocifren.");
            }
        }
        System.out.println("Rezultujuci broj je " + rezultat);
    }
}