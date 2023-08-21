package d18_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

//        (Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
//                Primer izvrsenja:
//        Unesite dimenziju table: 5

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite dimenziju table: ");
        int dimenzija = s.nextInt();

        for (int i = 0; i < dimenzija * dimenzija; i++) {

            if (i % dimenzija == 0) {
                System.out.println();
            }
            System.out.print("_|");
        }
    }
}


