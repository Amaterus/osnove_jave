package p25_08_2023;

public class Zadatak2 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            ispisiIme();
            System.out.print(" ");
            ispisiPrezime();
            System.out.println();
        }
    }

    public static void ispisiIme() {
        String ime = "Veljko";
        System.out.print(ime);
    }
    public static void ispisiPrezime() {
        String prezime = "Andjelkoic";
        System.out.print(prezime);
    }
}
