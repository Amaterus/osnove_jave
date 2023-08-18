package d17_08_2023;

import java.util.Scanner;

public class ZadatakZaVezbanje2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ukupan broj pregleda: ");
        int ukupanBrojPregleda = s.nextInt();

        if (ukupanBrojPregleda <= 50000){
            System.out.println("Tea ce zaraditi " + (ukupanBrojPregleda / 1000));
        }
        else if (ukupanBrojPregleda > 50000 && ukupanBrojPregleda <= 100000){
            System.out.println("Tea ce zaraditi " + (ukupanBrojPregleda /1000 - 50));
        }
        else if (ukupanBrojPregleda > 100000){
            System.out.println("Tea ce zaraditi " + (ukupanBrojPregleda / 2000 - 50));
        }
    }
}
