package p17_08_2023;

import java.util.Scanner;

public class Zadatak7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("POCETAK");
        System.out.println("Unesite broj telefona: ");
        String brojTelefona = s.next();

       if (!brojTelefona.contains("+381") || brojTelefona.contains("/")){
           System.out.println("Broj telefona nije validan.");
       } else {
           System.out.println("Broj je validan.");
       }
        System.out.print("KRAJ");
    }


}

