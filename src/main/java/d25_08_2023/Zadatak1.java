package d25_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost: ");
        int broj = s.nextInt();

        int vrednostVezaZa10 = stampajVrednostZa10Vecu(broj);
        System.out.println("Vrednost pre: " + broj + " i " + "vrednost uvecana za 10: " + vrednostVezaZa10);


    }

    public static int stampajVrednostZa10Vecu(int vrednost){
        return vrednost = vrednost + 10;
    }
}
