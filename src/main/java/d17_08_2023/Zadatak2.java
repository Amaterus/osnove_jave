package d17_08_2023;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();

        System.out.println("Unesite b (vrednost 1 ili 2): ");
        int b = s.nextInt();

        if (b == 1) {
            System.out.println("Nova vrednost za a je " + (a + 10));
        }
        else if (b == 2) {
            System.out.println("Nova vrednot za a je " + (a - 20));
        }
    }
}
