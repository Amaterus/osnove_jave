package d12_09_2023;

public class ZeleniKarton {
    private String punoIme;
    private String brojIndexa;
    private String nazivPredmeta;
    private String punoImeProfesora;
    private int ocena;

    public ZeleniKarton(String punoIme, String brojIndexa,String nazivPredmeta, String punoImeProfesora, int ocena){
        this.punoIme = punoIme;
        this.brojIndexa = brojIndexa;
        this.nazivPredmeta = nazivPredmeta;
        this.punoImeProfesora = punoImeProfesora;
        this.ocena = ocena;
    }
    public String getPunoIme() {
        return punoIme;
    }
    public void setPunoIme(String punoIme){
        this.punoIme = punoIme;
    }

    public String getBrojIndeksa() {
        return brojIndexa;
    }
    public void setBrojIndexa(String brojIndexa){
        this.brojIndexa = brojIndexa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public void setNazivPredmeta(String nazivPredmeta){
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getpunoImeProfesora() {
        return punoImeProfesora;
    }
    public void setPunoImeProfesora(String punoImeProfesora){
        this.punoImeProfesora = punoImeProfesora;
    }

    public int getOcena() {
        return ocena;
    }
    public void setOcena(int ocena) {
        if (ocena < 5 || ocena > 10) {
            System.out.println("Ocena mora biti između 5 i 10");
        }
        this.ocena = ocena;
    }
    public boolean jeIspitPolozen() {
        return ocena > 5;
    }
    public void stampaj() {
        System.out.println(nazivPredmeta + " - " + ocena);
        System.out.println("Student: " + this.punoIme + ", " + this.brojIndexa);
        System.out.println("Profesor: " + this.punoImeProfesora);
    }

}
