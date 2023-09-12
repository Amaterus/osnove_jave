package p12_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Korisnik n = new Korisnik("Nikola Nikolic");
        n.pretplatiSe(100);


        ZoomCall call = new ZoomCall("https://zoom.us/3209329032",
                "1290329832", n);
//        Korisnik milan = new Korisnik("Milan Jovanovic");
//        call.setGuest(milan);
        call.setGuest(new Korisnik("Milan Jovanovic"));
        call.pokreniPoziv();

    }
}
