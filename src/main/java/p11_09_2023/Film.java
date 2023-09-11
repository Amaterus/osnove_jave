package p11_09_2023;

public class Film {
    private String nazivFilma;
    private int godinaFilma;
    private Reziser reziser;

    public Film(String nazivFilma, int godinaFilma , Reziser reziser) {
        this.nazivFilma = nazivFilma;
        this.godinaFilma = godinaFilma;
        this.reziser = reziser;
    }

    public String getNazivFilma() {
        return nazivFilma;
    }

    public void setNazivFilma(String nazivFilma) {
        this.nazivFilma = nazivFilma;
    }

    public int getGodinaFilma() {
        return godinaFilma;
    }

    public void setGodinaFilma(int godinaFilma) {
        this.godinaFilma = godinaFilma;
    }

    public Reziser getReziser() {
        return reziser;
    }

    public void setReziser(Reziser reziser) {
        this.reziser = reziser;
    }

    public void print() {
        System.out.println(nazivFilma + ", " + godinaFilma);
        if (reziser != null) {
            System.out.println("Rezirao: " + reziser.getImePrezime() + ", Starost: " + reziser.getStarost() + " godina");
        }
    }
}
