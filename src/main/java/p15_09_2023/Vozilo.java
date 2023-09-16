package p15_09_2023;

public class Vozilo {
    protected String registracija;
    protected String marka;
    protected int brzina;

    public String getRegistracija() {
        return registracija;
    }

    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getBrzina() {
        return brzina;
    }

    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }
    public void dodajGas() {
        this.brzina = this.brzina + 10;
    }
    public void koci() {
        this.brzina = this.brzina - 10;
    }
}
