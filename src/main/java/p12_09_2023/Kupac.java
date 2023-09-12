package p12_09_2023;

public class Kupac {

    private String punoIme;

    private Kartica kartica;


    public Kupac(String punoIme, Kartica kartica) {
        this.punoIme = punoIme;
        this.kartica = kartica;
    }

    public String getPunoIme() {
        return this.punoIme;
    }

    public Kartica getKartica() {
        return this.kartica;
    }


}
