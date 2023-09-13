package d12_09_2023;

public class Transakcija {
    private int idTransakcije;
    private Racun racunOdakleSePrenoseSredstva;
    private Racun racunNaKojiSePrenoseSredstva;

    public Transakcija(int idTransakcije, Racun racunOdakleSePrenoseSredstva, Racun racunNaKojiSePrenoseSredstva) {
        this.idTransakcije = idTransakcije;
        this.racunOdakleSePrenoseSredstva = racunOdakleSePrenoseSredstva;
        this.racunNaKojiSePrenoseSredstva = racunNaKojiSePrenoseSredstva;
    }

    public int getIdTransakcije() {
        return idTransakcije;
    }

    public Racun getRacunOdakleSePrenoseSredstva() {
        return racunOdakleSePrenoseSredstva;
    }

    public Racun getRacunNaKojiSePrenoseSredstva() {
        return racunNaKojiSePrenoseSredstva;
    }

    public double izracunajProviziju(double iznosTransakcije) {
        if (iznosTransakcije < 4500) {
            return 45;
        } else {
            return 0.01 * iznosTransakcije;
        }
    }
    public void izvrsiTransakciju(double iznosTransakcije) {
        double provizija = izracunajProviziju(iznosTransakcije);
        double ukupanIznos = iznosTransakcije - provizija;

        if (racunOdakleSePrenoseSredstva.getTrenutnoStanje() < iznosTransakcije) {
            return;
        }

        racunOdakleSePrenoseSredstva.skiniSaRacuna(ukupanIznos);
        racunNaKojiSePrenoseSredstva.uplatiNaRacun(iznosTransakcije);
    }
    public void stampaj() {
        System.out.println("ID transakcije: " + idTransakcije);
        System.out.println("Racun sa: " + racunOdakleSePrenoseSredstva.getImePrezimeOsobe() + " - " + racunOdakleSePrenoseSredstva.getBrojRacuna());
        System.out.println("Racun na: " + racunNaKojiSePrenoseSredstva.getImePrezimeOsobe() + " - " + racunNaKojiSePrenoseSredstva.getBrojRacuna());
    }
}