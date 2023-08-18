package p18_08_2023;

import java.util.Scanner;

public class Zadatak11Vezbanje {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite duzinu videa (s): ");
        int duzina = s.nextInt();

        System.out.print("Unesite trenutno vreme videa (s): ");
        int vreme = s.nextInt();

        if (duzina <= 0 || vreme < 0 || vreme > duzina) {
            System.out.println("Neispravan unos. Duzina mora biti pozitivna, a vreme izmedju 0 i duzine.");
            return;
        }

        double procenat = (double) vreme / duzina * 100;
        int zvezdice = (int) (procenat + 0.5);

        for (int i = 0; i < 100; i++) {
            if (i < zvezdice) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
    }
}

