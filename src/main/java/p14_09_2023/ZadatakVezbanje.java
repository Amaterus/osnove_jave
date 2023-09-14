package p14_09_2023;

public class ZadatakVezbanje {
    public static void main(String[] args) {
        History history = new History();


        HistoryPage page1 = new HistoryPage("Google", "https://www.google.com", 10, 30, "velja", "veljko2000");
        HistoryPage page2 = new HistoryPage("Facebook", "https://www.facebook.com", 11, 15, "pera99", "peki027");

        history.otvoriStranicu(page1);
        history.otvoriStranicu(page2);

        System.out.println("Istorija:");
        history.pogledajIstoriju();


        history.sacuvajKredencije("Google", "korisnik", "sifra");
        history.obrisiKolaciceZaLink("https://www.facebook.com");
        history.obrisiIstoriju();


        System.out.println("Istorija nakon brisanja:");
        history.pogledajIstoriju();


        HistoryPage page3 = new HistoryPage("Twitter", "https://www.twitter.com", 14, 45, "zika232", "zile12121");
        HistoryPage page4 = new HistoryPage("LinkedIn", "https://www.linkedin.com", 15, 20, "blabla", "blabla123");

        history.otvoriStranicu(page3);
        history.otvoriStranicu(page4);

        history.obrisiSveKolacice();


        System.out.println("Istorija nakon brisanja kolacica:");
        history.pogledajIstoriju();


        int trenutniSat = 16;
        int trenutniMinut = 0;


        history.obrisiSveKolaciceZaPoslednjiSat(trenutniSat, trenutniMinut);


        System.out.println("Istorija nakon brisanja kolacica za poslednji sat:");
        history.pogledajIstoriju();
    }
}
