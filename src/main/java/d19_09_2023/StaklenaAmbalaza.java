package d19_09_2023;

public class StaklenaAmbalaza extends Ambalaza {
    private double kaucija;
    private boolean placaKauciju;
    private double osnovnaCena;


    public StaklenaAmbalaza(double kaucija, boolean placaKauciju, double osnovnaCena) {
        super();
        this.kaucija = kaucija;
        this.placaKauciju = placaKauciju;
        this.osnovnaCena = osnovnaCena;
    }



    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isPlacaKauciju() {
        return placaKauciju;
    }

    public void setPlacaKauciju(boolean placaKauciju) {
        this.placaKauciju = placaKauciju;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double vratiCenuArtikla() {
        if (placaKauciju) {
            return (osnovnaCena * 1.2) + kaucija;
        } else {
            return osnovnaCena * 1.2;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Bar kod: " + getBarkod());
        System.out.println("Naziv artikla: " + getNazivArtikla());
        System.out.println("Neto tezina: " + getNetoTezina());
        System.out.println("Bruto tezina: " + getBrutoTezina());
        System.out.println("Kaucija: " + this.kaucija);
        System.out.println("Placa kauciju: " + this.placaKauciju);
        System.out.println("Osnovna cena: " + this.osnovnaCena);
    }
}

