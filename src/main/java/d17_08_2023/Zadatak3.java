package d17_08_2023;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter actual url: ");
        String actualUrl = s.next();

        System.out.println("Enter expected url: ");
        String expectedUrl = s.next();

        System.out.println("Enter error code: ");
        String errorCode = s.next();

        if (actualUrl.equals(expectedUrl)){
            System.out.println("1 Test passed");
        }
        else {
            System.out.println("Assertation error: Expected " + expectedUrl + " but got " + actualUrl + ", " + "error code " + errorCode);
        }
    }
}
