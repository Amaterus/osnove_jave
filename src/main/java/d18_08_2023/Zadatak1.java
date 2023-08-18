package d18_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Unesite vrednost x: ");
        int x = s.nextInt();
        
        int y = 0;
        if (x < 2) {
            y = x;
        } else if (x < 10) {
            y = 2;
        } else {
            y = x - 1;
        }
        System.out.println("y = " + y);
    }
}

