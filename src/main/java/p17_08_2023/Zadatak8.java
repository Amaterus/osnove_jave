package p17_08_2023;

import java.util.Scanner;

public class Zadatak8 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite stranicu trougla a: ");
        int a = s.nextInt();

        System.out.println("Unesite stranicu trougla b: ");
        int b = s.nextInt();

        System.out.println("Unesite stranicu trougla c: ");
        int c = s.nextInt();

        if ((a * a) + (b * b) == (c * c)) {
            System.out.println("Trougao je pravougli.");
        }
        else System.out.println("Trougao nije pravougli.");


    }
}
