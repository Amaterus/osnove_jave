package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<Integer> niz = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        niz.add(15);
        niz.add(27);
        niz.add(8);
        niz.add(42);
        niz.add(53);
        niz.add(10);
        niz.add(64);
        niz.add(91);
        niz.add(37);
        niz.add(5);

        System.out.print("Unesite poziciju od 0 do 9: ");
        int pozicija = s.nextInt();

        System.out.print("Unesite novu vrednost: ");
        int novaVrednost = s.nextInt();

        niz.set(pozicija, novaVrednost);

        System.out.println("Element na " + pozicija + ". poziciji sada ima vrednost " + novaVrednost + ".");
        System.out.println("Niz nakon promene: " + niz);
    }
}


