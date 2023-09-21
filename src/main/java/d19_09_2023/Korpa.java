package d19_09_2023;

import java.util.ArrayList;

public class Korpa {
    protected ArrayList<Ambalaza> ambalaze = new ArrayList<>();

    public void dodajAmbalazu(Ambalaza ambalaza) {
        ambalaze.add(ambalaza);
    }

    public void izbaciAmbalazu(String barkod) {
        for (int i = 0; i < ambalaze.size(); i++) {
            Ambalaza ambalaza = ambalaze.get(i);
            if (ambalaza.getBarkod().equals(barkod)) {
                ambalaze.remove(i);
            }
        }
    }

    private double vratiCenuSaPopustom(double popust) {
        double ukupnaCena = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            Ambalaza ambalaza = ambalaze.get(i);
            ukupnaCena += ambalaza.vratiCenuArtikla();
        }
        return ukupnaCena - (ukupnaCena * (popust / 100));
    }

    public double racunajUkupnuCenuKorpe(SuperKartica superKartica) {
        double popust = superKartica.getPopust();
        return vratiCenuSaPopustom(popust);
    }
}

