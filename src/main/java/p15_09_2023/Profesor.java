package p15_09_2023;

public class Profesor extends Osoba {
    private String nazivPredmeta;
    private double iznosPlate;

    public Profesor() {
        super();
    }

    public Profesor(String ime, String prezime, String jmbg, String nazivPredmeta, double iznosPlate) {
        super(ime, prezime, jmbg);
        this.nazivPredmeta = nazivPredmeta;
        this.iznosPlate = iznosPlate;
    }

    public void povecajPlatu(double procenatPovecanja) {
        iznosPlate = iznosPlate + iznosPlate * (procenatPovecanja / 100);
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Naziv predmeta: " + nazivPredmeta);
        System.out.println("Iznos plate: " + iznosPlate);
    }
}

