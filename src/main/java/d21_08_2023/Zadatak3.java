package d21_08_2023;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();

        int brojac = 0;
        int counter = 100 / n;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite tekst: ");
            String tekst = s.next();

            if (tekst.contains("!")) {
                System.out.println(tekst);
                brojac = brojac + counter;
            } else {
                System.out.println(tekst + "!");
            }
        }
        System.out.println("Nivo agresivnosti " + brojac + " %");
    }
}
