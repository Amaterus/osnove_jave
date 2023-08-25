package p24_08_2023;

import java.util.ArrayList;

public class Zadatak7 {
    public static void main(String[] args) {

        ArrayList<String> imenaPasti = new ArrayList<>();
        ArrayList<Integer> cenePasti = new ArrayList<>();

        imenaPasti.add("AGLIO E OLIO");
        cenePasti.add(500);

        imenaPasti.add("PRIMAVERA");
        cenePasti.add(340);

        imenaPasti.add("ARRABBIATA");
        cenePasti.add(420);

        imenaPasti.add("NAPOLITANA");
        cenePasti.add(440);

        imenaPasti.add("POLLO E SPINACI");
        cenePasti.add(550);

        System.out.println("Meni:");
        for (int i = 0; i < imenaPasti.size(); i++) {
            System.out.println(imenaPasti.get(i) + " ………………… " + cenePasti.get(i) + " rsd");
        }
    }
}

