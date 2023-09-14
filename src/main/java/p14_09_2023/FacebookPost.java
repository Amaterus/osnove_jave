package p14_09_2023;

import java.util.ArrayList;

public class FacebookPost {
    private String punoIme;
    private String tekstObjave;
    private ArrayList<Reakcija> reakcije;


    public FacebookPost(String punoIme, String tekstObjave) {
        this.punoIme = punoIme;
        this.tekstObjave = tekstObjave;
        this.reakcije = new ArrayList<>();
    }


    public void reaguj(String tipReakcije, String punoIme) {
        Reakcija novaReakcija = new Reakcija(tipReakcije, punoIme);
        reakcije.add(novaReakcija);
    }


    public String getPunoIme() {
        return this.punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getTekstObjave() {
        return tekstObjave;
    }

    public void setTekstObjave(String tekstObjave) {
        this.tekstObjave = tekstObjave;
    }

    public ArrayList<Reakcija> getReakcije() {
        return reakcije;
    }

    public void setReakcije(ArrayList<Reakcija> reakcije) {
        this.reakcije = reakcije;
    }
}
