package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

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
        System.out.println("Unesite X: ");
        int x = s.nextInt();

        System.out.print("Elementi niza A koji su jednaki broju X imaju indekse: ");

        for (int i = 0; i < nizA.size(); i++) {
            if(nizA.get(i) == x) {
                System.out.print(i + ", ");
            }
        }
     }
}
