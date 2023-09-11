package d08_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        SmartAirConditioning klima = new SmartAirConditioning();
        klima.marka = "Gree";
        klima.potrosnjaDokHladi = 100;
        klima.potrosnjaDokGreje = 80;
        klima.izabranaTemperatura = 24;
        klima.mod = "hladi";

        klima.stampa();
        double mesecnaPotrosnja = klima.mesecnaPotrosnja();
        System.out.println("Mesecna potrosnja: " + mesecnaPotrosnja + " kW/h");

        double mesecnaCena = klima.mesecnaCena();
        System.out.println("Mesecna cena: " + mesecnaCena + " dinara");
    }
}
