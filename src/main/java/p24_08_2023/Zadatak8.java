package p24_08_2023;

import java.util.ArrayList;

public class Zadatak8 {
    public static void main(String[] args) {

        ArrayList<String> polja = new ArrayList<>();

        polja.add("first name");
        polja.add("last name");
        polja.add("email");
        polja.add("password");
        polja.add("phone");
        polja.add("address");

        ArrayList<Boolean> obaveznaPolja = new ArrayList<>();

        obaveznaPolja.add(true);
        obaveznaPolja.add(true);
        obaveznaPolja.add(true);
        obaveznaPolja.add(true);
        obaveznaPolja.add(false);
        obaveznaPolja.add(false);

        for (int i = 0; i < polja.size(); i++) {
            System.out.print(polja.get(i) + ":");
            if (obaveznaPolja.get(i)) {
                System.out.println(" * _______________________");
            } else {
                System.out.println("  _______________________");
            }
        }
    }
}
