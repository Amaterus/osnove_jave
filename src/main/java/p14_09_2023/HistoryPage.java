package p14_09_2023;

public class HistoryPage {
    private String naziv;
    private String link;
    private int vremeOtvaranjaMinut;
    private int vremeOtvaranjaSat;
    private String username;
    private String password;

    public HistoryPage(String naziv, String link, int vremeOtvaranjaMinut, int vremeOtvaranjaSat, String username, String password) {
        this.naziv = naziv;
        this.link = link;
        this.vremeOtvaranjaMinut = vremeOtvaranjaMinut;
        this.vremeOtvaranjaSat = vremeOtvaranjaSat;
        this.username = username;
        this.password = password;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getLink() {
        return link;
    }

    public int getVremeOtvaranjaMinut() {
        return vremeOtvaranjaMinut;
    }

    public int getVremeOtvaranjaSat() {
        return vremeOtvaranjaSat;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setVremeOtvaranjaMinut(int vremeOtvaranjaMinut) {
        this.vremeOtvaranjaMinut = vremeOtvaranjaMinut;
    }

    public void setVremeOtvaranjaSat(int vremeOtvaranjaSat) {
        this.vremeOtvaranjaSat = vremeOtvaranjaSat;
    }
    public void sacuvajKredencijaleZaStranicu(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void obrisiKolacice() {
        this.username = null;
        this.password = null;
    }
    public void stampaj() {
        System.out.print("[" + this.vremeOtvaranjaSat + "] - [" + this.vremeOtvaranjaMinut + "] - [" + this.naziv + "]...[" + this.link + "]");
        if (username != null && password != null) {
            System.out.print("*");
        }
        System.out.println();
    }

}
