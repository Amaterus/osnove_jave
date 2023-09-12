package p12_09_2023;

public class Proizvod {
    private String naziv;
    private Kupac kupac;

    private int cenaIzrade;

    public Proizvod(String naziv, int cenaIzrade) {
        this.naziv = naziv;
        this.cenaIzrade = cenaIzrade;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public double cena() {
        return this.cenaIzrade * 1.9 * (100.0 - this.kupac.getKartica().getPopust()) / 100;
    }

    public void stampaj() {
        System.out.println(this.naziv + ", cena: " + this.cena());
    }
}
