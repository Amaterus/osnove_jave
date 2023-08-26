package d24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {

    public static void main(String[] args) {

        ArrayList<Integer> niz = new ArrayList<>();

        niz.add(1);
        niz.add(2);
        niz.add(4);
        niz.add(5);
        niz.add(7);

        for (int i = niz.size() - 1; i >= 0; i--) {
            System.out.println(niz.get(i));
        }
    }
}
