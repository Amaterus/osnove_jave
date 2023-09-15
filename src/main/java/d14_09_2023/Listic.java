package d14_09_2023;

import java.util.ArrayList;

public class Listic {
    private ArrayList<Kombinacija> kombinacije;

    public Listic() {
        kombinacije = new ArrayList<>();
    }

    public void dodajKombinaciju(Kombinacija kombinacija) {
        kombinacije.add(kombinacija);
    }

    public boolean dobitna(Kombinacija dobitnaKombinacija) {
        for (int i = 0; i < kombinacije.size(); i++) {
            Kombinacija kombinacija = kombinacije.get(i);
            if (kombinacija.daLiJeIstaKombinacija(dobitnaKombinacija)) {
                return true;
            }
        }
        return false;
    }

    public void stampaj() {
        for (int i = 0; i < kombinacije.size(); i++) {
            Kombinacija kombinacija = kombinacije.get(i);
            kombinacija.stampaj();
        }
    }
}
