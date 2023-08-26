package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizA = new ArrayList<>();
        ArrayList<Integer> nizB = new ArrayList<>();

        System.out.println("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            nizA.add(broj);
        }
        for (int i = 0; i < nizA.size(); i++) {
            if (i < 3) {
                nizB.add(nizA.get(i));
            } else {
                nizB.add(1);
            }
        }
        System.out.println(nizA);
        System.out.println(nizB);
    }
}
