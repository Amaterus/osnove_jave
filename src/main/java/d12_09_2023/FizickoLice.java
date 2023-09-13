package d12_09_2023;

public class FizickoLice {
    private String punoIme;
    private String brojLicneKarte;
    private String jmbg;
    private boolean kupioPrekoAgencije;

    public FizickoLice(String punoIme, String brojLicneKarte, String jmbg, boolean kupioPrekoAgencije) {
        this.punoIme = punoIme;
        this.brojLicneKarte = brojLicneKarte;
        this.jmbg = jmbg;
        this.kupioPrekoAgencije = kupioPrekoAgencije;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public String getBrojLicneKarte() {
        return brojLicneKarte;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isKupioPrekoAgencije() {
        return kupioPrekoAgencije;
    }

    public void setKupioPrekoAgencije(boolean kupioPrekoAgencije) {
        this.kupioPrekoAgencije = kupioPrekoAgencije;
    }

    public void stampaj() {
        System.out.println(this.punoIme + ", " + this.brojLicneKarte);
    }
}
