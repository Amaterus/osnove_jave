package d19_09_2023;

public class Tetrapak extends Ambalaza {
    private boolean mozeReciklirati;
    private double osnovnaCena;

    public Tetrapak() {
    }

    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean mozeReciklirati, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.mozeReciklirati = mozeReciklirati;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean getMozeReciklirati() {
        return mozeReciklirati;
    }

    public void setMozeReciklirati(boolean mozeReciklirati) {
        this.mozeReciklirati = mozeReciklirati;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double vratiCenuArtikla() {
        if (mozeReciklirati) {
            return (racunajTezinuPakovanja() * 1.5) + osnovnaCena;
        } else {
            return osnovnaCena;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Bar kod: " + getBarkod());
        System.out.println("Naziv artikla: " + getNazivArtikla());
        System.out.println("Neto tezina: " + getNetoTezina());
        System.out.println("Bruto tezina: " + getBrutoTezina());
        System.out.println("Moze reciklirati: " + this.mozeReciklirati);
        System.out.println("Osnovna cena: " + this.osnovnaCena);
    }


}
