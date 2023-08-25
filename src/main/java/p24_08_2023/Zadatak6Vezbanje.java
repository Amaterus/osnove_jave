package p24_08_2023;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak6Vezbanje {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<>();

        niz.add(10);
        niz.add(20);
        niz.add(30);
        niz.add(40);
        niz.add(50);
        niz.add(60);
        niz.add(70);
        niz.add(80);
        niz.add(90);
        niz.add(100);

        System.out.println("Oridjidji niz: " + niz);

        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int indeks1 = random.nextInt(niz.size());
            int indeks2 = random.nextInt(niz.size());

            int privremeno = niz.get(indeks1);
            niz.set(indeks1, niz.get(indeks2));
            niz.set(indeks2, privremeno);
        }
        System.out.println("Nakon mesanja: " + niz);
    }
}


