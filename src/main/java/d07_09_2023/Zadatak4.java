package d07_09_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Film film1 = new Film();
        System.out.println("Unesite naziv filma: ");
        film1.naslov = s.next();

        System.out.println("Unesite godinu izdanja filma: ");
        film1.godinaIzdanja = s.nextInt();

        System.out.println("Unesite rezisera: ");
        film1.reziser = s.next();

        Film film2 = new Film();
        System.out.println("Unesite naziv filma: ");
        film2.naslov = s.next();

        System.out.println("Unesite godinu izdanja filma: ");
        film2.godinaIzdanja = s.nextInt();

        System.out.println("Unesite rezisera: ");
        film2.reziser = s.next();

        Film film3 = new Film();
        System.out.println("Unesite naziv filma: ");
        film3.naslov = s.next();

        System.out.println("Unesite godinu izdanja filma: ");
        film3.godinaIzdanja = s.nextInt();

        System.out.println("Unesite rezisera: ");
        film3.reziser = s.next();

        System.out.println("Naslov filma je " + film1.naslov + ", godina izdanja je " + film1.godinaIzdanja + " i reziser je " + film1.reziser);
        System.out.println("Naslov filma je " + film2.naslov + ", godina izdanja je " + film2.godinaIzdanja + " i reziser je " + film2.reziser);
        System.out.println("Naslov filma je " + film3.naslov + ", godina izdanja je " + film3.godinaIzdanja + " i reziser je " + film3.reziser);
    }
}
