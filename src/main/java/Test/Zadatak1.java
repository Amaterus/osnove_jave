package Test;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int brojPoklapanja = 0;

        System.out.println("Unesite kriterijume za traženje vašeg idealnog muškarca.");

        System.out.println("Min visina: ");
        int minVisina = s.nextInt();

        System.out.println("Max visina: ");
        int maxVisina = s.nextInt();

        System.out.println("Mesto: ");
        String idealnoMesto = s.next();

        System.out.println("Min starost: ");
        int minStarost = s.nextInt();

        System.out.println("Max starost: ");
        int maxStarost = s.nextInt();

        System.out.println("Boja kose: ");
        String idealnaBojaKose = s.next();

        System.out.println("Potrebno je da ima bradu: ");
        boolean idealnaBrada = s.nextBoolean();

        System.out.println("Unesite karakteristike muškarca:");

        System.out.println("Visina: ");
        int visina = s.nextInt();

        System.out.println("Mesto: ");
        String mesto = s.next();

        System.out.println("Starost: ");
        int starost = s.nextInt();

        System.out.println("Boja kose: ");
        String bojaKose = s.next();

        System.out.println("Potrebno je da ima bradu: ");
        boolean brada = s.nextBoolean();

        if (visina >= minVisina && visina <= maxVisina) {
            brojPoklapanja++;
        }
        if (mesto.equals(idealnoMesto)) {
            brojPoklapanja++;
        }
        if (starost >= minStarost && starost <= maxStarost) {
            brojPoklapanja++;
        }
        if (bojaKose.equals(idealnaBojaKose)) {
            brojPoklapanja++;
        }
        if (brada == idealnaBrada) {
            brojPoklapanja++;
        }
        if (brojPoklapanja >= 3) {
            System.out.println("Pronašli ste svog idealnog muškarca!");
        } else {
            System.out.println("Muškarac ne ispunjava vaše zahteve.");
        }
    }
}
