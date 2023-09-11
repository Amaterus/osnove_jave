package p11_09_2023;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private boolean naBudzetu;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public boolean getNaBudzetu() {
        return naBudzetu;
    }

    public void setNaBudzetu(boolean naBudzetu) {
        this.naBudzetu = naBudzetu;
    }

    public void stampa() {
        System.out.println(this.ime + " " + this.prezime + " sa brojem indexa " + this.brojIndeksa + " " + this.naBudzetu + " na budzetu");
    }
}
