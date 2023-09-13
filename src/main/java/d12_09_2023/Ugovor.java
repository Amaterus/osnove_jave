package d12_09_2023;

public class Ugovor {
    private int godinaSklapanja;
    private int danSklapanja;
    private int mesecSklapanja;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private double cena;
    private String adresaNekretnine;

    public Ugovor(int godinaSklapanja, int danSklapanja, int mesecSklapanja, FizickoLice prodavac, FizickoLice kupac, double cena, String adresaNekretnine) {
        this.godinaSklapanja = godinaSklapanja;
        this.danSklapanja = danSklapanja;
        this.mesecSklapanja = mesecSklapanja;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresaNekretnine = adresaNekretnine;
    }
    public double procenatZarade() {
        if (kupac.isKupioPrekoAgencije()) {
            return 0.02;
        } else {
            return 0.03;
        }
    }
    public double zaradaAgencije() {
        return 1000 + this.cena * this.procenatZarade();
    }
    public void stampaj() {
        System.out.println("Dana " + this.danSklapanja + "." + this.mesecSklapanja + "." + godinaSklapanja + ".god" + " sklopljen je ugovor izmedju " + this.prodavac.getPunoIme() + " i " + this.kupac.getPunoIme() + " o kupovini nekretnine " + this.adresaNekretnine + " po ceni od " + this.cena + " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + this.zaradaAgencije());
    }
}
