package d12_09_2023;

public class Ringla {
    private String tip;
    private int jacina;
    private double jacinaGrejaca;

    public Ringla() {
        this.jacina = 0;
    }

    public Ringla(String tip, int jacina, double jacinaGrejaca) {
        if (tip.equals("obicna")) {
            this.tip = tip;
            if (jacina >= 0 && jacina <= 3) {
                this.jacina = jacina;
            }
        } else if (tip.equals("ekspres")) {
            this.tip = tip;
            if (jacina >= 0 && jacina <= 12) {
                this.jacina = jacina;
            }
        }
        this.jacinaGrejaca = jacinaGrejaca;
    }

    public String getTip() {
        return this.tip;
    }

    public int getJacina() {
        return this.jacina;
    }

    public double getJacinaGrejaca() {
        return this.jacinaGrejaca;
    }

    private int maxBrojPojacavanja() {
        if (this.tip.equals("obicna")) {
            return 3;
        } else if (this.tip.equals("ekspres")) {
            return 12;
        } else return 0;
    }

    public void pojacajRinglu() {
        if (this.tip.equals("obicna")) {
            if (this.jacina < 3) {
                this.jacina++;
            } else if (this.tip.equals("ekspres")) {
                if (this.jacina < 12) {
                    this.jacina++;
                }
            }
        }
    }
    public void iskljuciRinglu() {
        this.jacina = 0;
    }
    public boolean jeUpaljenaRingla() {
        return this.jacina > 0;
    }
    public double potrosnjaElektricneEnergije(double brojSati) {
         return (double) 100 / (this.maxBrojPojacavanja() * this.jacina * this.jacinaGrejaca * brojSati);
    }
    public void stampaj(){
        if (jeUpaljenaRingla()){
            System.out.println("Ringla je upaljena.");
        } else {
            System.out.println("Ringla je iskljucena.");
        }
        System.out.println("Tip ringle: " + this.tip);
        System.out.println("Jacina: " + this.jacina);
        System.out.println("Grejac: " + this.jacinaGrejaca);
    }
}