package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji prikazuje element na poziciji K. K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//        Primer:
//        Unesite pozicjiu: 2
//        Na pozicji 2 je vrednost 7.

        ArrayList<Integer> brojevi = new ArrayList<>();

        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite poziciju: ");
        int pozicija = s.nextInt();

        if (pozicija >= 0 && pozicija < brojevi.size()) {
            int vrednost = brojevi.get(pozicija);
            System.out.println("Na poziciji " + pozicija + " je vrednost " + vrednost + ".");
        } else {
            System.out.println("Greska");
        }
    }
}


