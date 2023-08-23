package p22_08_2023;

import java.util.Scanner;

public class Zadatak2 {
    //    CTRL + ALT + L
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int counter = 0;

        while (counter < 2) {
            System.out.println("Unesite broj:");
            int broj = s.nextInt();

            if (broj == 0) {
                counter++;
            }
        }

        System.out.println("KRAJ JER SU UNETE 2 NULE.");

    }
}
