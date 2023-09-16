package p15_09_2023;

public class Zadatak2 {
        public static void main(String[] args) {
            VisaKartica visa = new VisaKartica(453, "4012-1239-1221-3381", 2023, 5, "Veljko Andjelkovic");
            visa.dodajSredstva(100);
            visa.izvrsiTransakciju(50);
            visa.stampaj();

            MasterKartica master = new MasterKartica(423, "4012-1239-1221-3381", 2019, 12);
            master.dodajSredstva(50);
            master.izvrsiTransakciju(100);
            master.naplatiOdrzavanje();
            master.stampaj();
        }
    }
