package Test;

public class Zadatak4 {
    public static void main(String[] args) {

       String primer1 = metodaDva("google.com", "Welcome to Google");
        System.out.println(primer1);

        String primer2 = prvaMetoda("Ovaj deo je bold", "bold");
        System.out.print(primer2);
        System.out.print(",a");
        String primer3 = prvaMetoda("ovo je italic", "italic");
        System.out.print(primer3);
        String primer4 = prvaMetoda("Naravno samo je falio paragraf", "paragraph");
        System.out.println();
        System.out.println(primer4);
    }

    public static String prvaMetoda(String tekst, String tip) {
        if (tip.equals("bold")) {
            return "<b>" + tekst + "</b>";
        } else if (tip.equals("italic")) {
            return "<em>" + tekst + "</em>";
        } else if (tip.equals("paragraph")) {
            return "<p>" + tekst + "</p>";
        } else {
            return tekst;
        }

    }
    public static String metodaDva(String link, String tekst) {
        return "<a href=" + link + ">" + tekst + "</a>";
    }
}
