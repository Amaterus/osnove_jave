package p21_08_2023;

import java.util.Scanner;

public class Zadatak11Vezbanje {



    public static void main(String[] args) {

//        Napisati program prikazuje koliko je svaki od unetih passworda jak. Korisnik unosi N passworda i za svaki se ispisuje jacina.
//        Svaki uslov koji password ispunjava dodaje po 1 poen:
//        duzina veca od 8
//        sadrzi @ specijalan karakter
//
//        Primer izvrsenja:
//        Unesite N: 3
//        Unesite password: passwdr
//        Password ima 0 poena.
//                Unesite password: password123
//        Password ima 1 poena.
//                Unesite password: password@123
//        Password ima 2 poena.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite password: ");
            String password = s.next();
            int points = 0;
            if (password.length() > 8) {
                points = points + 1;
            }
            if (password.contains("@")) {
                points = points + 1;
            }
            System.out.println("Password ima " + points + " poena.");
        }
    }
}

