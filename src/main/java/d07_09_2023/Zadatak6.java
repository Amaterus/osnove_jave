package d07_09_2023;

public class Zadatak6 {
    public static void main(String[] args) {
        Vozilo vozilo1 = new Vozilo();
        vozilo1.marka = "Toyota";
        vozilo1.model = "Camry";
        vozilo1.registarskiBroj = "BG123AB";
        vozilo1.godinaProizvodnje = 2022;

        Vozilo vozilo2 = new Vozilo();
        vozilo2.marka = "Ford";
        vozilo2.model = "Focus";
        vozilo2.registarskiBroj = "NS456CD";
        vozilo2.godinaProizvodnje = 2020;

        Vozac vozac1 = new Vozac();
        vozac1.ime = "Marko";
        vozac1.prezime = "Markovic";
        vozac1.JMBG = "1234567890123";
        vozac1.brojDozvole = "A1234567";
        vozac1.datumIstekaDozvole = "2025-12-31";

        Vozac vozac2 = new Vozac();
        vozac2.ime = "Ana";
        vozac2.prezime = "Anic";
        vozac2.JMBG = "9876543210987";
        vozac2.brojDozvole = "B7654321";
        vozac2.datumIstekaDozvole = "2024-10-15";

        Ruta ruta1 = new Ruta();
        ruta1.polaznaTacka = "Beograd";
        ruta1.odrediste = "Novi Sad";
        ruta1.duzinaRute = 80.5;
        ruta1.ocekivanoVremePutovanja = 1.5;

        Ruta ruta2 = new Ruta();
        ruta2.polaznaTacka = "Nis";
        ruta2.odrediste = "Subotica";
        ruta2.duzinaRute = 300.0;
        ruta2.ocekivanoVremePutovanja = 4.0;

        Dostava dostava1 = new Dostava();
        dostava1.vozilo = vozilo1;
        dostava1.vozac = vozac1;
        dostava1.ruta = ruta1;
        dostava1.statusDostave = "Naruceno";
        dostava1.datumDostave = "2023-09-08";

        Dostava dostava2 = new Dostava();
        dostava2.vozilo = vozilo2;
        dostava2.vozac = vozac2;
        dostava2.ruta = ruta2;
        dostava2.statusDostave = "U toku";
        dostava2.datumDostave = "2023-09-10";

        System.out.println("Informacije o prvoj dostavi:");
        System.out.println("Vozilo: " + dostava1.vozilo.marka + " " + dostava1.vozilo.model + ", registarski broj: " + dostava1.vozilo.registarskiBroj + ", godina proizvodnje: " + dostava1.vozilo.godinaProizvodnje);
        System.out.println("Vozac: " + dostava1.vozac.ime + " " + dostava1.vozac.prezime + ", JMBG: " + dostava1.vozac.JMBG + ", broj dozvole: " + dostava1.vozac.brojDozvole + ", datum isteka dozvole: " + dostava1.vozac.datumIstekaDozvole);
        System.out.println("Ruta: polazna tacka: " + dostava1.ruta.polaznaTacka + ", odrediste: " + dostava1.ruta.odrediste + ", duzina rute: " + dostava1.ruta.duzinaRute + ", ocekivano vreme putovanja: " + dostava1.ruta.ocekivanoVremePutovanja);
        System.out.println("Status dostave: " + dostava1.statusDostave);
        System.out.println("Datum dostave: " + dostava1.datumDostave);

        System.out.println();

        System.out.println("Informacije o drugoj dostavi:");
        System.out.println("Vozilo: " + dostava2.vozilo.marka + " " + dostava2.vozilo.model + ", registarski broj: " + dostava2.vozilo.registarskiBroj + ", godina proizvodnje: " + dostava2.vozilo.godinaProizvodnje);
        System.out.println("Vozac: " + dostava2.vozac.ime + " " + dostava2.vozac.prezime + ", JMBG: " + dostava2.vozac.JMBG + ", broj dozvole: " + dostava2.vozac.brojDozvole + ", datum isteka dozvole: " + dostava2.vozac.datumIstekaDozvole);
        System.out.println("Ruta: polazna tacka: " + dostava2.ruta.polaznaTacka + ", odrediste: " + dostava2.ruta.odrediste + ", duzina rute: " + dostava2.ruta.duzinaRute + ", ocekivano vreme putovanja: " + dostava2.ruta.ocekivanoVremePutovanja);
        System.out.println("Status dostave: " + dostava2.statusDostave);
        System.out.println("Datum dostave: " + dostava2.datumDostave);
    }
}



