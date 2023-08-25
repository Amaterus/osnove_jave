package p24_08_2023;

import java.util.ArrayList;

public class UvodNizovi {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        String x = cars.get(0); // vraca vrednost sa nulte pozicije u promenljivu
        String x1 = cars.get(1); //
        String x2 = cars.get(2); //
        cars.get(0);

        cars.set(2, "Nissan");

        System.out.println("KRAJ");
    }


}


//cars.size(); // string.length() isti princip kao ovo kod stringa