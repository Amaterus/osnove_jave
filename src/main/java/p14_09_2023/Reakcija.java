package p14_09_2023;

public class Reakcija {
    private String tipReakcije;
    private String punoIme;

    public Reakcija(String tipReakcije, String punoIme) {
        this.tipReakcije = tipReakcije;
        this.punoIme = punoIme;
    }
    public String getTipReakcije() {
        return tipReakcije;
    }
    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }
}
