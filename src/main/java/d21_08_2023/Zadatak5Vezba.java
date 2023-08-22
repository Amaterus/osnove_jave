package d21_08_2023;


import java.util.Random;
import java.util.Scanner;

public class Zadatak5Vezba {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
                int x = random.nextInt(50);
                int y = random.nextInt(50);

                int suma = x + y;
                System.out.println("Koliko je " + x + " + " + y + " ?");

                int rezultat = s.nextInt();

                if (rezultat == suma) {
                    System.out.println("Cestitam!");
                } else {
                    System.out.println("Greska");
                }
            }
        }
    }
