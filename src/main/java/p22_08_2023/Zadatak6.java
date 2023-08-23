package p22_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String bedWords = "zajebava mars stoko svinjo";
        boolean endOfLine = false;

        while (!endOfLine) {
            System.out.println("Unesite rec:");
            String rec = s.next();
//           zajebava.
            if (bedWords.contains(rec)) {
                System.out.println("Beeeeeeeeeeeep");
            } else {
                System.out.println(rec);
            }

//            if (rec.contains("zajebava") ||
//            rec.contains("mars") ||
//            rec.contains("stoko") ||
//            rec.contains("svinjo")) {
//                System.out.println("Beeeeeeeeeeeep");
//            } else {
//                System.out.println(rec);
//            }

            if (rec.endsWith(".")) {
                endOfLine = true;
            }
        }

        System.out.println("KRAJ");





    }
}
