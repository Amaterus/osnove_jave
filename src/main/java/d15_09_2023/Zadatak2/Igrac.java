package d15_09_2023.Zadatak2;

import java.util.ArrayList;

public class Igrac extends Osoba {
    protected int broj;
    protected String pozicija;
    protected ArrayList<Karton> kartoni = new ArrayList<>();
    protected boolean jeKapiten;

    public Igrac() {
    }

    public Igrac(String punoIme, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean jeKapiten) {
        super(punoIme, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.jeKapiten = jeKapiten;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isJeKapiten() {
        return jeKapiten;
    }

    public void setJeKapiten(boolean jeKapiten) {
        this.jeKapiten = jeKapiten;
    }

    public void dodajKarton(Karton karton) {
        this.kartoni.add(karton);
    }

    public int brojZutih() {
        int brojac = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (this.kartoni.get(i).getTip().equals("zuti")) {
                brojac++;
            }

        }
        return brojac;
    }

    public int brojCrvenih() {
        int brojac = 0;
        for (int i = 0; i < this.kartoni.size(); i++) {
            if (this.kartoni.get(i).getTip().equals("crveni")) {
                brojac++;
            }
        }
        return brojac;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("BROJ: " + this.broj);
        System.out.println("POZICIJA: " + this.pozicija);
        System.out.println("KARTONI:");
        ArrayList<Karton> kartons = this.kartoni;
        for (int i = 0; i < kartons.size(); i++) {
            Karton karton = kartons.get(i);
            System.out.println("  - " + karton.getTip());
        }
        System.out.println("JE KAPITEN ?: " + this.jeKapiten);
    }
}
