package d18_08_2023;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime = s.next();

        System.out.println("Unesite prezime: ");
        String prezime = s.next();

        System.out.println("Unesite jmbg: ");
        String jmbg = s.next();

        System.out.println("Unesite broj primerka za stampu: ");
        int brojPrimerka = s.nextInt();

        for (int i = 0; i < brojPrimerka; i++) {
            System.out.println("Primerak " + (i + 1));
            System.out.println("**********************************");
            System.out.println("Ime i prezime: " + ime + " " + prezime);
            System.out.println("JMBG: " + jmbg);
            System.out.println("**********************************");
        }

    }
}
