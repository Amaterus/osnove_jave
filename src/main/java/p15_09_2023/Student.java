package p15_09_2023;

public class Student extends Osoba {
    private int brojIndeksa;
    private double dugZaSkolarinu;

    public Student(String ime, String prezime, String jmbg, int brojIndeksa, double dugZaSkolarinu) {
        super(ime, prezime, jmbg);
        this.brojIndeksa = brojIndeksa;
        this.dugZaSkolarinu = dugZaSkolarinu;
    }

    public void uplatiSkolarinu(double iznosUplate) {
        dugZaSkolarinu -= iznosUplate;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Broj indeksa: " + brojIndeksa);
        System.out.println("Dug za skolarinu: " + dugZaSkolarinu);
    }
}
