package p07_09_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Racun prvi = new Racun();
        prvi.imeIPrezime = "Veljko Andjelkovic";
        prvi.brojRacuna = "840-23932-323";
        prvi.stanjeRacuna = 500;

        Racun drugi = new Racun();
        drugi.imeIPrezime = "Petar Perovic";
        drugi.brojRacuna = "840-23932-434";
        drugi.stanjeRacuna = 550;

        System.out.println(prvi.imeIPrezime + ", " + prvi.brojRacuna + ", " + prvi.stanjeRacuna);
        System.out.println(drugi.imeIPrezime + ", " + drugi.brojRacuna + ", " + drugi.stanjeRacuna);


        System.out.println("Unesite sumu za transakciju: ");
        int suma = s.nextInt();

        prvi.stanjeRacuna = prvi.stanjeRacuna - suma;
        drugi.stanjeRacuna = drugi.stanjeRacuna + suma;

        System.out.println("Stanje nakon transakcije je");
        System.out.println(prvi.imeIPrezime + ", " + prvi.brojRacuna + ", " + prvi.stanjeRacuna);
        System.out.println(drugi.imeIPrezime + ", " + drugi.brojRacuna + ", " + drugi.stanjeRacuna);


    }
}
