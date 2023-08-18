package p18_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite jacinu zvuka: ");
        int j = s.nextInt();


        if (j < 0 || j > 10) {
            System.out.println("Neispravan unos. Jacina zvuka mora biti između 0 i 10.");
        }


        if (j == 0) {
            System.out.println("</");
        } else {
            System.out.print("< ");

            for (int i = 0; i < j; i++) {
                System.out.print("| ");
            }

            System.out.println();
        }
    }
}

