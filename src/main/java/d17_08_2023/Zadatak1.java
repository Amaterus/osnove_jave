package d17_08_2023;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = s.next();

        System.out.println("Unesite prezime: ");
        String prezime = s.next();

        System.out.println("Unesite koliko imate godina: ");
        String godine = s.next();

        System.out.println(ime + " " + prezime + " " + godine + " god");


    }
}
