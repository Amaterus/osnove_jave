package p25_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite rimski broj:");
        String rimskiBroj = s.nextLine();

        int arapskiBroj = konvertujUArapski(rimskiBroj);
        System.out.println("Arapski broj za rimski broj " + rimskiBroj + " je: " + arapskiBroj);
    }

    public static int konvertujUArapski(String rimski) {
        if (rimski.equals("I")) {
            return 1;
        } else if (rimski.equals("II")){
            return 2;
        } else if (rimski.equals("III")){
            return 3;
        } else if (rimski.equals("IV")){
            return 4;
        } else if (rimski.equals("V")){
            return 5;
        } else {
            return 0;
        }
    }
}





