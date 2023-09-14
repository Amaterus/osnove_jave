package p14_09_2023;
import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        Reakcija reakcija1 = new Reakcija("like", "Veljko Andjelkovic");
        Reakcija reakcija2 = new Reakcija("srce", "Pera Peric");

        FacebookPost post1 = new FacebookPost("Zika Zikic", "blablabla");
        FacebookPost post2 = new FacebookPost("Marko Markovic", "dobro vece");

        post1.reaguj("srce", "velja");
        post1.reaguj("like", "pera");

        System.out.println("Post od " + post1.getPunoIme() + ":");
        System.out.println(post1.getTekstObjave());
        System.out.println("Reakcije na post:");

        ArrayList<Reakcija> reakcije = post1.getReakcije();
        for (int i = 0; i < reakcije.size(); i++) {
            Reakcija reakcija = reakcije.get(i);
            System.out.println(reakcija.getPunoIme() + " je reagovao sa " + reakcija.getTipReakcije());
        }
    }
}




