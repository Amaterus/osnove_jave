package d08_09_2023;

public class SmartAirConditioning {

    public String marka;
    public int potrosnjaDokHladi;
    public int potrosnjaDokGreje;
    public int izabranaTemperatura;
    public String mod;

    public void stampa() {
        System.out.println(this.marka + " - " + this.mod + " - " + this.izabranaTemperatura);
    }

    public double mesecnaPotrosnja() {
        double potrosnjaPoSatu;
        if (mod.equals("hladi")) {
            potrosnjaPoSatu = potrosnjaDokHladi;
        } else {
            potrosnjaPoSatu = potrosnjaDokGreje;
        }
        return 30 * 15 * potrosnjaPoSatu;
    }

    public double mesecnaCena() {
        double mesecnaPotrosnja = mesecnaPotrosnja();
        double cena;

        if (mesecnaPotrosnja <= 350) {
            cena = mesecnaPotrosnja * 6;
        } else {
            double zelenaZona = 350 * 6;
            double ostatak = (mesecnaPotrosnja - 350) * 9;
            cena = zelenaZona + ostatak;
        }
        return cena;
    }
}
