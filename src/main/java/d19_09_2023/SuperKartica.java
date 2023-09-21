package d19_09_2023;

public class SuperKartica {
    private int brojKartice;
    private String imePrezimeVlasnika;
    private int popust;

    public SuperKartica() {

    }

    public SuperKartica(int brojKartice, String imePrezimeVlasnika, int popust) {
        this.brojKartice = brojKartice;
        this.imePrezimeVlasnika = imePrezimeVlasnika;
        this.popust = popust;
    }

    public int getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImePrezimeVlasnika() {
        return imePrezimeVlasnika;
    }

    public void setImePrezimeVlasnika(String imePrezimeVlasnika) {
        this.imePrezimeVlasnika = imePrezimeVlasnika;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public void stampaj() {
        System.out.println("(" + this.brojKartice + "), (" + this.imePrezimeVlasnika + ")");
    }

}

