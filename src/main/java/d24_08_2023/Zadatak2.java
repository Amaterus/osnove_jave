package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<>();

        System.out.println("Unesite N: ");
        int n = s.nextInt();

        int counterParnih = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            brojevi.add(broj);
        }
        for (int i = 0; i < brojevi.size(); i++) {
            if (brojevi.get(i) % 2 == 0) {
                counterParnih++;
            }
        }
        System.out.println("U nizu ima " + counterParnih + " parna broja");

    }
}
