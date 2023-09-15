package d14_09_2023;

import java.util.ArrayList;

public class Student {
    private String brojIndeksa;
    private String imePrezime;
    private String tipStudija;
    private ArrayList<Ispit> ispiti = new ArrayList<>();

    public Student(String brojIndeksa, String imePrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imePrezime = imePrezime;
        this.tipStudija = tipStudija;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void dodajIspit(Ispit ispit) {
        ispiti.add(ispit);
    }

    public double racunajProsek() {
        int brojPolozenih = 0;
        int sumaOcena = 0;

        for (int i = 0; i < ispiti.size(); i++) {
            Ispit ispit = ispiti.get(i);
            if (ispit.isPolozen()) {
                brojPolozenih++;
                sumaOcena += ispit.getOcena();
            }
        }

        if (brojPolozenih == 0) {
            return 0;
        }

        return (double) sumaOcena / brojPolozenih;
    }

    public void stampaj() {
        System.out.println("(" + brojIndeksa + ") - " + imePrezime + " - " + tipStudija);
        System.out.println("Predmeti:");

        for (int i = 0; i < ispiti.size(); i++) {
            Ispit ispit = ispiti.get(i);
            ispit.stampajIspit();
        }

        System.out.println("Prosecna ocena: " + racunajProsek());
    }
}
