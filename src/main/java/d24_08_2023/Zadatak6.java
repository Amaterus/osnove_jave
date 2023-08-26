package d24_08_2023;

import java.util.ArrayList;
import java.util.Objects;

public class Zadatak6 {

    public static void main(String[] args) {

        ArrayList<String> linkovi = new ArrayList<>();
        ArrayList<Integer> expectedCodes = new ArrayList<>();
        ArrayList<Integer> actualCodes = new ArrayList<>();

        linkovi.add("https://cms.demo.katalon.com/cart/");
        linkovi.add("https://cms.demo.katalon.com/shop/");
        linkovi.add("https://cms.demo.katalon.com/account/");
        linkovi.add("https://cms.demo.katalon.com/cart/");
        linkovi.add("https://cms.demo.katalon.com/test/");

        expectedCodes.add(200);
        expectedCodes.add(200);
        expectedCodes.add(404);
        expectedCodes.add(204);
        expectedCodes.add(200);

        actualCodes.add(200);
        actualCodes.add(200);
        actualCodes.add(400);
        actualCodes.add(200);
        actualCodes.add(404);

        for (int i = 0; i < linkovi.size(); i++) {
            if (!(Objects.equals(expectedCodes.get(i), actualCodes.get(i)))) {
                System.out.println("Assertion Error: Link " + linkovi.get(i) + "expected status code " + expectedCodes.get(i) + " but got " + actualCodes.get(i));
            }
        }
    }
}
