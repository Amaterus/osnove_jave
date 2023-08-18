package d18_08_2023;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite x: ");
        int x = s.nextInt();

        for (int i = 0; i < 9; i++) {
            System.out.println(x + "X" + (i + 1) + " = " + x * (i + 1));
        }
    }
}
