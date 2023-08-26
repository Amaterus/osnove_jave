package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> nizA = new ArrayList<>();

        System.out.println("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            nizA.add(broj);
        }

        System.out.print("Brojevi veci od nule u nizu A su: ");
        for (int i = 0; i < nizA.size(); i++) {
            if (nizA.get(i) > 0) {
                System.out.print(nizA.get(i) + ", ");
            }
        }
    }
}

