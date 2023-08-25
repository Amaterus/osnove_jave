package p24_08_2023;

import java.util.ArrayList;

public class UvodNizova3 {

    public static void main(String[] args) {

        ArrayList<Integer> brojevi = new ArrayList<>();

        brojevi.add(10); // first get(0)
        brojevi.add(20);  // get(1)
        brojevi.add(30);  // get(2)
        brojevi.add(40); // get(3)
        brojevi.add(50); // last get(4)

        for (int i = 0; i < brojevi.size(); i++) {
            int x = brojevi.get(i);
            System.out.print(x + ", ");
        }

        System.out.println("KRAJ");
    }
}
