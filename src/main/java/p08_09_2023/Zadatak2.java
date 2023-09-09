package p08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Auto auto1 = new Auto();
        auto1.vozac = "Veljko Andjelkovic";
        auto1.brojVrata = 5;
        auto1.potrosnjaNa100Km = 5.4;
        auto1.trenutnaBrzina = 150;
        auto1.marka = "Audi";
        auto1.godinaProizvodnje = 1999;
        auto1.mesecRegistracije = 7;
        auto1.kubikaza = 50;
        auto1.maksimalnaBrzina = 250;

        auto1.stampanje();

        boolean prekoracenjeBrzine = auto1.prekoracenjeBrzine(130);
        int kazna = auto1.izracunajKaznu(130);
        boolean jeOldTimer = auto1.jeOldtimer();
        boolean isteklaRegistracija = auto1.isteklaRegistracija(3);
        double cenaRegistracije = auto1.cenaRegistracije();
        int dodajGas = auto1.dodajGas();
        double trenutnaPotrosnjaAuta = auto1.trenutnaPotrosnjaAuta();
        int kadaKoci = auto1.koci();


        System.out.println("Prekoracenje brzine " + prekoracenjeBrzine);
        System.out.println("Kazna je " + kazna);
        System.out.println("Auto je old timer: " + jeOldTimer);
        System.out.println("Da li je registracija istekla: " + isteklaRegistracija);
        System.out.println("Cena registracije je: " + cenaRegistracije);
        System.out.println("Kada koci je: " + kadaKoci);
        System.out.println("Dodat gas je: " + dodajGas);

        System.out.println("Trenutna potrosnja je: " + trenutnaPotrosnjaAuta);
        auto1.stampajTablu();
    }
}
