package d11_09_2023;

public class FacebookPost {
    private String opis;
    private Korisnik korisnik;

    public FacebookPost() {

    }

    public FacebookPost(String opis, Korisnik korisnik) {
        this.opis = opis;
        this.korisnik = korisnik;
    }

    public void stampanje() {
        System.out.println("(" + this.korisnik.getIme() + ") (" + this.korisnik.getPrezime() + ")");
        System.out.println(this.opis);
    }
}
