package Test;

import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random randomBroj = new Random();

        int tajniBroj = randomBroj.nextInt(50) + 1;

        int brojPokusaja = 5;

        while (brojPokusaja > 0) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            brojPokusaja--;

            if (broj == tajniBroj) {
                System.out.println("Čestitamo, pogodili ste tajni broj!");
            } else if (broj < tajniBroj) {
                System.out.println("Tajni broj je veci.");
            } else {
                System.out.println("Tajni broj je manji.");
            }
        }
    }
}
