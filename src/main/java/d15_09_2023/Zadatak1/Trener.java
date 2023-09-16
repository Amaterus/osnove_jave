package d15_09_2023;

public class Trener extends Osoba {
    private int godineIskustva;
    private String tip;

    public Trener() {
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Trener(String punoIme, String jmbg, int godinaRodjenja, int godineIskustva, String tip) {
        super(punoIme, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tip = tip;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Godine iskustva: " + this.godineIskustva);
        System.out.println("Tip trenera: " + this.tip);
    }
}
