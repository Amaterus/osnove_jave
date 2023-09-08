package d07_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        Proizvod proizvod1 = new Proizvod();
        proizvod1.naziv = "Macbook Pro";
        proizvod1.cena = 1000;

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv = "Iphone 13";
        proizvod2.cena = 800;

        Proizvod proizvod3 = new Proizvod();
        proizvod3.naziv = "Google Pixel";
        proizvod3.cena = 700;

        System.out.println("Proizvod naziva " + proizvod1.naziv + " i njegova cena " + proizvod1.cena);
        System.out.println("Proizvod naziva " + proizvod2.naziv + " i njegova cena " + proizvod2.cena);
        System.out.println("Proizvod naziva " + proizvod3.naziv + " i njegova cena " + proizvod3.cena);
    }
}
