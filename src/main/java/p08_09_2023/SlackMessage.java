package p08_09_2023;

public class SlackMessage {

    public String tekst;
    public String imeIPrezime;
    public String datumIVreme;
    public String azuriranoVreme;

    public void stampanjePoruke() {
        System.out.println(this.imeIPrezime + " - " + this.datumIVreme);
        System.out.println(this.tekst);
    }

    public String convertToString() {
        String result = this.imeIPrezime + " - " + this.datumIVreme + ", " + this.tekst;
        return result;
    }
    public void azurirajPoruku(String noviTekst, String azuriranoVreme) {
        this.tekst = noviTekst;
        this.azuriranoVreme = azuriranoVreme;
    }
}
