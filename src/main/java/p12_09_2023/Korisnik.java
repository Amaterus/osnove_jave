package p12_09_2023;

public class Korisnik {
    private String imeIPrezime;
    private String licenca;

    public Korisnik() {
        this.licenca = "basic";
    }

    public Korisnik(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
        this.licenca = "basic";
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getLicenca() {
        return licenca;
    }

    public void pretplatiSe(int suma) {
        if (suma == 100) {
            this.licenca = "pro";
        } else if (suma == 150) {
            this.licenca = "premium";
        }
    }

    public void ponistiPretplatu() {
        this.licenca = "basic";
    }


    public int maksimalnaDuzinaPoziva() {
        if (this.licenca.equals("basic")) {
            return 40;
        } else if (this.licenca.equals("pro")) {
            return 240;
        } else if (this.licenca.equals("premium")) {
            return 1440;
        }
        return 0;
    }



}
