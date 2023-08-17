package p17_08_2023;

import java.util.Scanner;

public class UvodScanner {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.println("Unesite ime: ");
        String ime = s.next();

        System.out.println("Unesite prezime: ");
        String prezime = s.next();

        System.out.println("Unesite kilazu: ");
        double kg = s.nextDouble();

        System.out.println("Unesite da li ste aktivni: ");
        boolean aktivan = s.nextBoolean();

        System.out.println("IME " + ime);
        System.out.println("PREZIME " + prezime);
        System.out.println("KILAZA " + kg);
        System.out.println("AKTIVNOST " + aktivan);




//        System.out.println("Unesite broj a: ");
//        int a = s.nextInt();
//
//        System.out.println("Unesite broj b: ");
//        int b = s.nextInt();
//
//        System.out.println("KRAJ");
//
//
//        int zbir = a + b;
//        int proizvod = a * b;
//        int kolicnik = a / b;
//        int razlika = a - b;
//
//        System.out.println("Zbir " + zbir + ", " + "Proizvod " + proizvod + ", " + "Razlika " + razlika + ", " + "Kolicnik " + kolicnik );

    }
}