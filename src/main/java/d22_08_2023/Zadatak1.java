package d22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
//        Unesite vrednost: 20
//        Unesite vrednost: 50
//        Unesite vrednost: 50
//        Prekoracenje! Kraj programa. Sracunata suma je 70.

        Scanner s = new Scanner(System.in);
        int suma = 0;

        while (suma <= 100) {
            System.out.print("Unesite vrednost: ");
            int unos = s.nextInt();

            if (suma + unos > 100) {
                System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + suma + ".");
            } else {
                suma = suma + unos;
            }
        }
        System.out.println("Sracunata suma je " + suma + ".");
    }
}

