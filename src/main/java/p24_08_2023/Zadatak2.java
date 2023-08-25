package p24_08_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.
//                Npr: 1,4,5,6,7 => 1,4,5,60,8
//        int a = 10;
//        a = a * 10;

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(1);
        brojevi.add(4);
        brojevi.add(5);
        brojevi.add(6);
        brojevi.add(7);

        brojevi.set(3, brojevi.get(3) * 10);
        System.out.println(brojevi);
    }
}

