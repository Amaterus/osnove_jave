package d11_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Korisnik korisnik = new Korisnik("Pera", "Peric");
        FacebookPost post = new FacebookPost("Blablabla", korisnik);

        korisnik.stampanje();
        post.stampanje();
    }

}
