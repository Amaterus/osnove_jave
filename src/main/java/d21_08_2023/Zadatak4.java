package d21_08_2023;

import java.security.PrivilegedExceptionAction;
import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();

        int likeCounter = 0;
        int heartCounter = 0;
        int smileCounter = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Reaguj: ");
            String reakcija = s.next();

            if (reakcija.equals("like")) {
                likeCounter++;
            } else if (reakcija.equals("heart")) {
                heartCounter++;
            } else if (reakcija.equals("smile")) {
                smileCounter++;
            }

        }
        System.out.println("Summary: " + "like " + likeCounter + " |" + "smile " + smileCounter + " |" + "heart " + heartCounter);
    }
}