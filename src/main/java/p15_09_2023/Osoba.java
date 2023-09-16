package p15_09_2023;

public class Osoba {
    protected String ime;
    protected String prezime;
    protected String jmbg;

    public Osoba() {
        super();
    }

    public Osoba(String ime, String prezime, String jmbg) {
        super();
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
    }

    public void stampaj() {
        System.out.println(ime + " " + prezime + ", " + jmbg);
    }
}
