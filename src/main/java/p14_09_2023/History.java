package p14_09_2023;

import java.util.ArrayList;

public class History {
    private ArrayList<HistoryPage> istorijaStranica = new ArrayList<>();

    public void otvoriStranicu(HistoryPage novaStranica) {
        istorijaStranica.add(novaStranica);
    }

    public void obrisiPremaLinku(String link) {
        for (int i = 0; i < istorijaStranica.size(); i++) {
            HistoryPage stranica = istorijaStranica.get(i);
            if (stranica.getLink().equals(link)) {
                istorijaStranica.remove(i);
                i--;
            }
        }
    }

    public void obrisiKolaciceZaLink(String link) {
        for (int i = 0; i < istorijaStranica.size(); i++) {
            HistoryPage stranica = istorijaStranica.get(i);
            if (stranica.getLink().equals(link)) {
                stranica.obrisiKolacice();
            }
        }
    }

    public void obrisiIstoriju() {
        istorijaStranica.clear();
    }

    public void sacuvajKredencije(String nazivStranice, String username, String password) {
        for (int i = 0; i < istorijaStranica.size(); i++) {
            HistoryPage stranica = istorijaStranica.get(i);
            if (stranica.getNaziv().equals(nazivStranice)) {
                stranica.sacuvajKredencijaleZaStranicu(username, password);
            }
        }
    }

    public void pogledajIstoriju() {
        for (int i = 0; i < istorijaStranica.size(); i++) {
            HistoryPage stranica = istorijaStranica.get(i);
            stranica.stampaj();
        }
    }

    public void obrisiSveKolacice() {
        for (int i = 0; i < istorijaStranica.size(); i++) {
            HistoryPage stranica = istorijaStranica.get(i);
            stranica.obrisiKolacice();
        }
    }

    public void obrisiSveKolaciceZaPoslednjiSat(int trenutniSat, int trenutniMinut) {
        for (int i = 0; i < istorijaStranica.size(); i++) {
            HistoryPage stranica = istorijaStranica.get(i);
            if (trenutniSat - stranica.getVremeOtvaranjaSat() == 1 || (trenutniSat - stranica.getVremeOtvaranjaSat() == 0 && trenutniMinut - stranica.getVremeOtvaranjaMinut() <= 0)) {
                stranica.obrisiKolacice();
            }
        }
    }
}
