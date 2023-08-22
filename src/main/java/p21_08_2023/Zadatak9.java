package p21_08_2023;

import java.util.Scanner;

public class Zadatak9 {

    public static void main(String[] args) {

//        (Za vezbanje) Napisati program koji za sve petocifene brojeve radi mirror opciju.
//        Primer izvrsenja:
//        Unesite broj: 32492
//        Novi broj je 29423


        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        int broj = s.nextInt();


        if (broj < 10000 || broj > 99999) {
            System.out.println("Broj nije petocifren.");
        }

        int noviBroj = 0;

        for (int i = 0; i < 5; i++) {
            int cifra = broj % 10;

            noviBroj = noviBroj * 10 + cifra;

            broj = broj / 10;
        }
        System.out.println("Novi broj je " + noviBroj);
    }
}
