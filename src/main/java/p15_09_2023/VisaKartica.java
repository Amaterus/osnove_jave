package p15_09_2023;

public class VisaKartica extends PlatnaKartica {
    private String ovlascenoLice;

    public VisaKartica(double suma, String brojKartice, int godina, int mesec, String ovlascenoLice) {
        super(suma, brojKartice, godina, mesec);
        this.ovlascenoLice = ovlascenoLice;
    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlacenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }

    @Override
    public void izvrsiTransakciju(double vrednost) {
        double provizija = vrednost * 0.018;
        if (provizija < 4) {
            provizija = 4;
        }
        double suma = vrednost + provizija;
        super.izvrsiTransakciju(suma);
    }

    @Override
    public void stampaj() {
        System.out.print("Visa Card: ");
        System.out.println(getBrojKartice() + ", " + getMesec() + "/" + getGodina() + ", $" + getSuma());
    }
}
