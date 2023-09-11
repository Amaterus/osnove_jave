package p11_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        Film film = new Film("Blade", 2002, new Reziser("Djordje", 55));
        film.print();

        Reziser reziser = new Reziser("Kusturica", 70);
        reziser.print();

        film.setNazivFilma("Rambo");
        film.setGodinaFilma(1998);

        reziser.setImePrezime("Paul Thomas Anderson");
        reziser.setStarost(53);

        System.out.println();
        film.print();
        reziser.print();
    }
}
