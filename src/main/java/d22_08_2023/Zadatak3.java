package d22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
//
//        Primer izvrsenja:
//        Unesite rimski broj: X
//        Arapski: 10
//        Unesite rimski broj: C
//        Arapski: 50
//        Unesite rimski broj: D
//        Arapski: 500
//        Unesite rimski broj: M
//        Arapski: 1000
//        Unesite rimski broj: I
//        Arapski: 1
//        Unesite rimski broj: KRAJ
//        Kraj programa.

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Unesite rimski broj (KRAJ za kraj programa): ");
            String unos = s.next();

            if (unos.equals("KRAJ")) {
                System.out.println("Kraj programa.");
            }

            int arapskaVrednost = 0;
            int index = unos.length() - 1;

            int prethodnaArapska = 0;
            while (index >= 0) {
                char trenutniSimbol = unos.charAt(index);
                int trenutnaArapska = 0;

                if (trenutniSimbol == 'I') {
                    trenutnaArapska = 1;
                } else if (trenutniSimbol == 'V') {
                    trenutnaArapska = 5;
                } else if (trenutniSimbol == 'X') {
                    trenutnaArapska = 10;
                } else if (trenutniSimbol == 'L') {
                    trenutnaArapska = 50;
                } else if (trenutniSimbol == 'C') {
                    trenutnaArapska = 100;
                } else if (trenutniSimbol == 'D') {
                    trenutnaArapska = 500;
                } else if (trenutniSimbol == 'M') {
                    trenutnaArapska = 1000;
                }

                if (trenutnaArapska < prethodnaArapska) {
                    arapskaVrednost -= trenutnaArapska;
                } else {
                    arapskaVrednost += trenutnaArapska;
                }

                prethodnaArapska = trenutnaArapska;
                index--;
            }
            System.out.println("Arapski: " + arapskaVrednost);
        }
    }
}
