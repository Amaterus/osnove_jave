package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        ArrayList<Integer> brojevi = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            brojevi.add(broj);
        }
        System.out.println("Niz je: ");
        for (int i = 0; i < brojevi.size(); i++) {
            System.out.print(brojevi.get(i));
            if (i < brojevi.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
