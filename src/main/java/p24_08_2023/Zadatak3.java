package p24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(2);
        brojevi.add(4);
        brojevi.add(5);
        brojevi.add(6);
        brojevi.add(7);


        int prviElement = brojevi.get(0);
        int poslednjiElement = brojevi.get(brojevi.size() - 1);

        brojevi.set(0, poslednjiElement);
        brojevi.set(brojevi.size() - 1, prviElement);

        System.out.println(brojevi);
    }
}
