package d17_08_2023;

import java.util.Scanner;

public class ZadatakZaVezbanje1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite tekst: ");
        String tekst = s.next();

        System.out.println("Unesite tip formatiranja: ");
        String tip = s.next();

        if (tip.equals("bold")){
            tekst = "<b>" + tekst + "</b>";
            System.out.println(tekst);
        }
        else if (tip.equals("italic")){
            tekst = "<em>" + tekst + "</em>";
            System.out.println(tekst);
        }
        else if (tip.equals("code")){
            tekst = "<code> " + tekst + " </code>";
            System.out.println(tekst);
        }
        else if (tip.equals("link")){
            System.out.println("Unesite url: ");

            String url = s.next();

            System.out.println("<a href='" + url + "'>" + tekst + "</a>");

        }
    }
}
