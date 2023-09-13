package d12_09_2023;

public class ElektricniSporet {
    private String marka;
    private int garancija;
    private int maxBrojUkljucenihRingli;
    private Ringla goreLevo;
    private Ringla goreDesno;
    private Ringla doleLevo;
    private Ringla doleDesno;

    public ElektricniSporet(String marka, int garancija, int maxBrojUkljucenihRingli, Ringla goreLevo, Ringla goreDesno, Ringla doleLevo, Ringla doleDesno) {
        if (maxBrojUkljucenihRingli > 0 && maxBrojUkljucenihRingli < 5) {
            this.maxBrojUkljucenihRingli = maxBrojUkljucenihRingli;
        }
        this.marka = marka;
        this.garancija = garancija;
        this.goreLevo = goreLevo;
        this.goreDesno = goreDesno;
        this.doleLevo = doleLevo;
        this.doleDesno = doleDesno;
    }

    public String getMarka() {
        return this.marka;
    }

    public int getGarancija() {
        return this.garancija;
    }

    public int getMaxBrojUkljucenihRingli() {
        return this.maxBrojUkljucenihRingli;
    }

    public Ringla getGoreLevo() {
        return this.goreLevo;
    }

    public Ringla getGoreDesno() {
        return this.goreDesno;
    }

    public Ringla getDoleLevo() {
        return this.doleLevo;
    }

    public Ringla getDoleDesno() {
        return this.doleDesno;
    }

    public void iskljuciRinglu(int pozicija) {
        if (pozicija == 1) {
            this.goreLevo.iskljuciRinglu();

        } else if (pozicija == 2) {
            this.goreDesno.iskljuciRinglu();

        } else if (pozicija == 3) {
            this.doleLevo.iskljuciRinglu();

        } else if (pozicija == 4) {
            this.doleDesno.iskljuciRinglu();

        }
    }

    public void pojacajRinglu(int pozicija) {
        int brojUpaljenih = 0;

        boolean ringlaGoreLevo = false;
        boolean ringlaGoreDesno = false;
        boolean ringlaDoleLevo = false;
        boolean ringlaDoleDesno = false;


        if (pozicija == 1) {
            this.goreLevo.pojacajRinglu();
            ringlaGoreLevo = true;
        } else if (pozicija == 2) {
            this.goreDesno.pojacajRinglu();
            ringlaGoreDesno = true;
        } else if (pozicija == 3) {
            this.doleLevo.pojacajRinglu();
            ringlaDoleLevo = true;
        } else if (pozicija == 4) {
            this.doleDesno.pojacajRinglu();
            ringlaDoleDesno = true;
        }
        if (this.goreLevo.jeUpaljenaRingla()) {
            brojUpaljenih++;
        }
        if (this.goreDesno.jeUpaljenaRingla()) {
            brojUpaljenih++;
        }
        if (this.doleLevo.jeUpaljenaRingla()) {
            brojUpaljenih++;
        }
        if (this.doleDesno.jeUpaljenaRingla()) {
            brojUpaljenih++;
        }
        if (brojUpaljenih > this.maxBrojUkljucenihRingli) {
            if (!ringlaGoreLevo) {
                this.iskljuciRinglu(pozicija);
            }
            if (!ringlaGoreDesno) {
                this.iskljuciRinglu(pozicija);
            }
            if (!ringlaDoleLevo) {
                this.iskljuciRinglu(pozicija);
            }
            if (!ringlaDoleDesno) {
                this.iskljuciRinglu(pozicija);
            }
        }
    }
    public double potrosnjaZaSveRingle(double vreme1, double vreme2, double vreme3, double vreme4) {

        return this.goreLevo.potrosnjaElektricneEnergije(vreme1) + this.goreDesno.potrosnjaElektricneEnergije(vreme2) + this.doleLevo.potrosnjaElektricneEnergije(vreme3) + this.doleDesno.potrosnjaElektricneEnergije(vreme4);

    }
    public void stampaj(){
        System.out.println("marka " + this.marka + " - " + this.garancija + " godine garancije");
        System.out.println("Ringle: ");

        System.out.println("Gore levo: " );
        System.out.println("Ringla je " + this.goreLevo.jeUpaljenaRingla());
        System.out.println("Tip ringle: " + this.goreLevo.getTip());
        System.out.println("Jacina: " + this.goreLevo.getJacina());
        System.out.println("Grejac:" + this.goreLevo.getJacinaGrejaca());

        System.out.println("Gore desno: " );
        System.out.println("Ringla je " + this.goreDesno.jeUpaljenaRingla());
        System.out.println("Tip ringle: " + this.goreDesno.getTip());
        System.out.println("Jacina: " + this.goreDesno.getJacina());
        System.out.println("Grejac:" + this.goreDesno.getJacinaGrejaca());

        System.out.println("Dole levo: " );
        System.out.println("Ringla je " + this.doleLevo.jeUpaljenaRingla());
        System.out.println("Tip ringle: " + this.doleLevo.getTip());
        System.out.println("Jacina: " + this.doleLevo.getJacina());
        System.out.println("Grejac:" + this.doleLevo.getJacinaGrejaca());

        System.out.println("Dole desno: " );
        System.out.println("Ringla je " + this.doleDesno.jeUpaljenaRingla());
        System.out.println("Tip ringle: " + this.doleDesno.getTip());
        System.out.println("Jacina: " + this.doleDesno.getJacina());
        System.out.println("Grejac:" + this.doleDesno.getJacinaGrejaca());
    }
}

