package p17_08_2023;

import java.util.Scanner;

public class ZadatakZaVezbanje {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Znak karte na stolu: ");
        String znakNaStolu = s.nextLine();

        System.out.println("Broj karte na stolu: ");
        String brojNaStolu = s.nextLine();

        System.out.println("Znak karte koju zelis da odigras: ");
        String znakOdigran = s.nextLine();

        System.out.println("Broj karte koju zelis da odigras: ");
        String brojOdigran = s.nextLine();


        if (znakNaStolu.equals(znakOdigran) || brojNaStolu.equals(brojOdigran)) {
            System.out.println("Potez je validan.");
        } else {
            System.out.println("Potez nije validan.");
        }
    }
}

