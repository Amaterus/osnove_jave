package d17_08_2023;

import java.util.Scanner;

public class ZadatakZaVezbanje1 {

    public static void main(String[] args) {

//        Napisati program koji simulira formatiranje teksta sa slacka. Program od informacija ucitava:
//        rec koju formatira
//        tip formatiranja
//        link za linkovanu rec (opciono se unosi)
//        Program vrsi formatiranje u HTML-u i podrzava 4 tipa formatiranja: bold italic link code
//        Ukoliko se izabere bold tip, program rec obuhvati b tagom. Npr: rec Hello se formatira u <b>Hello</b>
//        Ukoliko se izabere italic tip, program rec obuhvati em tagom. Npr: rec Hello se formatira u <em>Hello</em>
//        Ukoliko se izabere code tip, program rec obuhvati codetagom. Npr: rec Hello se formatira u <code>Hello</code>
//        Ukoliko se izabere linktip, program od korisnika dodatno trazi da unese link na koji treba da vodi linkovana rec i linkuje rec a tagom. Npr: rec Googlese formatira u <a href='https://google.com'>Google</a>
//        Primer izvrsenja 1:
//        Enter text: Hello
//        Enter type: bold
//                <b>Hello</b>
//                Primer izvrsenja 2:
//        Enter text: Hello
//        Enter type: italic
//                <em>Hello</em>
//                Primer izvrsenja 3:
//        Enter text: Google
//        Enter type: link
//        Enter url: https://google.com
//<a href='https://google.com'>Google</a>

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
