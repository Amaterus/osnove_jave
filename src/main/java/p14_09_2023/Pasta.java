package p14_09_2023;

import java.util.ArrayList;

public class Pasta {
    private ArrayList<Sastojak> sastojci;

    public Pasta() {
        sastojci = new ArrayList<Sastojak>();
    }

    public void dodajSastojak(Sastojak s) {
        sastojci.add(s);
    }

    public double izracunajCenu() {
        double ukupnaCena = 0.0;
        for (int i = 0; i < sastojci.size(); i++) {
            ukupnaCena = ukupnaCena + sastojci.get(i).getCena();
        }
        return ukupnaCena;
    }

    public void stampaj() {
        System.out.println("Pasta je sa sastojcima:");
        for (int i = 0; i < sastojci.size(); i++) {
            sastojci.get(i).stampaj();
        }
        System.out.println("Cena paste je " + izracunajCenu() + " din");
    }

    public void brisanjeSastojaka(String naziv) {
        for (int i = 0; i < this.sastojci.size(); i++) {
            if (this.sastojci.get(i).getNaziv().equals(naziv)){
                sastojci.remove(i);
            }
        }
    }
}
