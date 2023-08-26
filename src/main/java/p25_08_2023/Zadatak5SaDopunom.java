package p25_08_2023;

import java.util.Scanner;

public class Zadatak5SaDopunom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite M: ");
        int m = s.nextInt();

        for (int i = 1; i <= m; i++) {
            printZvezdice(i);
        }
    }
    public static void printZvezdice(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
