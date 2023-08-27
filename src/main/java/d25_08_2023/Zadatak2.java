package d25_08_2023;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        String spajanje = spajanjeDvaBroja(2, 4);
        System.out.println(spajanje);

    }
    public static String spajanjeDvaBroja(int a, int b) {
        return a + ""+ b;
    }
}
