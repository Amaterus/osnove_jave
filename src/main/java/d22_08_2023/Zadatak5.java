package d22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int brojOtvorenihZagrada = 0;
        boolean kraj = false;

        System.out.println("Unos: ");

        while (!kraj) {
            String unos = scanner.nextLine();

            if (unos.equals("=")) {
                kraj = true;
            } else if (unos.equals("(")) {
                brojOtvorenihZagrada++;
            } else if (unos.equals(")")) {
                if (brojOtvorenihZagrada > 0) {
                    brojOtvorenihZagrada--;
                } else {
                    System.out.println("Zagrade nisu uparene");
                }
            }
        }
        if (brojOtvorenihZagrada == 0) {
            System.out.println("Zagrade su uparene");
        } else {
            System.out.println("Zagrade nisu uparene");
        }
    }
}



