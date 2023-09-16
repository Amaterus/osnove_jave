package p15_09_2023;

class MasterKartica extends PlatnaKartica {

    public MasterKartica(double suma, String brojKartice, int godina, int mesec) {
        super(suma, brojKartice, godina, mesec);
    }

    @Override
    public void izvrsiTransakciju(double vrednost) {
        double provizija = vrednost * 0.015;
        super.izvrsiTransakciju(vrednost + provizija);
    }

    public void naplatiOdrzavanje() {
        izvrsiTransakciju(2);
    }

    @Override
    public void stampaj() {
        System.out.print("Master Kartica: ");
        System.out.println(super.getMesec() + "/" + super.getGodina() + ", " + super.getBrojKartice() + ", $" + super.getSuma());
    }

}
