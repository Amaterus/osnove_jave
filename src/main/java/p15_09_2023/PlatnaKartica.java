package p15_09_2023;

public class PlatnaKartica {
    private double suma;
    private String brojKartice;
    private int godina;
    private int mesec;

    public PlatnaKartica() {
        super();
    }

    public PlatnaKartica(double suma, String brojKartice, int godina, int mesec) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godina = godina;
        this.mesec = mesec;
    }


    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodina() {
        return godina;
    }

    public int getMesec() {
        return mesec;
    }

    public void dodajSredstva(double vrednost) {
        this.suma = this.suma + vrednost;
    }

    public void izvrsiTransakciju(double vrednost) {
        this.suma = this.suma - vrednost;
    }

    public void stampaj() {
        System.out.println(this.brojKartice + ", " + this.mesec + "/" + this.godina + ", $" + this.suma);
    }
}
