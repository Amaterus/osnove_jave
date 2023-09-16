package p15_09_2023;

public class Auto extends Vozilo {
    private int brojVrata;

    public Auto() {
    }
    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    public void stampaj() {
        System.out.println("REGISTRACIJA: " + this.registracija);
        System.out.println("BRZINA: " + this.brzina);
        System.out.println("MARKA: " + this.marka);
        System.out.println("BROJ VRATA: " + this.brojVrata);
    }
}
