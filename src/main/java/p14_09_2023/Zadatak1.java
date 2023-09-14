package p14_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Pasta p = new Pasta();
        p.dodajSastojak(new Sastojak("Makarona", 100));
        p.dodajSastojak(new Sastojak("Paradajz sos", 200));
        p.dodajSastojak(new Sastojak("Sir", 300));
        p.stampaj();
        p.brisanjeSastojaka("Makarona");
        p.stampaj();
    }
}
