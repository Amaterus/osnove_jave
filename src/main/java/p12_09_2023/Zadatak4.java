package p12_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();

//        sastojci.add(new Sastojak("kafa", 150));
//        sastojci.add(new Sastojak("secer", 100));
//        sastojci.add(new Sastojak("piletina", 300));


        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N:");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite naziv: ");
            String naziv = s.next();
            System.out.println("Unesite cenu: ");
            int cena  = s.nextInt();
            sastojci.add(new Sastojak(naziv, cena));
//            Sastojak x = new Sastojak(naziv, cena);
//            sastojci.add(x);

        }


        for (int i = 0; i < sastojci.size(); i++) {
            sastojci.get(i).stampaj();
//            System.out.println(sastojci.get(i).getNaziv() + "- " + sastojci.get(i).getCena());
        }

    }
}
