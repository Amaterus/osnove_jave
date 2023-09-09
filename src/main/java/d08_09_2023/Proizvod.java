package d08_09_2023;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezinaUGramima;

    public void stampaj() {
        System.out.println(this.naziv + ", " + this.cena + ", " + this.tezinaUGramima);
    }

    public void povecajCenu(double povecanje) {
        this.cena = this.cena + povecanje;
    }

    public double vratiCenuSaPopustom(double popust) {
        if (popust >= 0 && popust <= 100) {
            double popustFaktor = 1 - (popust / 100);
            return cena * popustFaktor;
        } else {
            System.out.println("Neispravan popust. Popust mora biti između 0 i 100.");
            return cena;
        }
    }

    public double racunajPostarinu() {
        if (tezinaUGramima <= 100) {
            return 200;
        } else if (tezinaUGramima <= 500) {
            return 400;
        } else {
            return 1000;
        }
    }
}


