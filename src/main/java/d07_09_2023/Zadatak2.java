package d07_09_2023;

public class Zadatak2 {

    public static void main(String[] args) {

        Automobil automobil1 = new Automobil();
        automobil1.marka = "Mercedes";
        automobil1.model = "G";
        automobil1.godinaProizvodnje = 2020;

        Automobil automobil2 = new Automobil();
        automobil2.marka = "Porsche";
        automobil2.model = "Panamera";
        automobil2.godinaProizvodnje = 2016;

        Automobil automobil3 = new Automobil();
        automobil3.marka = "Lamborhini";
        automobil3.model = "Urus";
        automobil3.godinaProizvodnje = 2018;

        System.out.println("Marka auta je " + automobil1.marka + ", model je " + automobil1.model + ", i godina proizvodnje je " + automobil1.godinaProizvodnje);
        System.out.println("Marka auta je " + automobil2.marka + ", model je " + automobil2.model + ", i godina proizvodnje je " + automobil2.godinaProizvodnje);
        System.out.println("Marka auta je " + automobil3.marka + ", model je " + automobil3.model + ", i godina proizvodnje je " + automobil3.godinaProizvodnje);
    }
}
