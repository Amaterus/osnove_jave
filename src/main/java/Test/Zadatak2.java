package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<Integer> udaljenostDalekovoda = new ArrayList<>();

        System.out.println("Unesite N: ");
        int n = s.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Unesite rastojanje: ");
            int rastojanje = s.nextInt();
            udaljenostDalekovoda.add(rastojanje);

        }
        double duzina = 0;
        double p = 0;
        boolean brojac = false;


        for (int i = 0; i < udaljenostDalekovoda.size(); i++) {
            if (!brojac) {
                System.out.print("|..." + udaljenostDalekovoda.get(i)+ "m" + "...|");
                brojac = true;
            } else {
                System.out.print("..." + udaljenostDalekovoda.get(i) + "m" + "...|");
            }
        }
        for (int i = 0; i < udaljenostDalekovoda.size(); i++) {
            p = udaljenostDalekovoda.get(i) * 1.5;
            duzina = duzina + p;
            if (udaljenostDalekovoda.get(i) < 50 || udaljenostDalekovoda.get(i) > 100){
                System.out.println("Rastojanje na poziciji "  + i + ", duzine " + udaljenostDalekovoda.get(i)+ "m" + " nije po standardima Evropske unije. ");
            }
        }
        System.out.println("Potrebna dužina kablova za dalekovodnu infrastrukturu je " + duzina + "m");
    }
}
