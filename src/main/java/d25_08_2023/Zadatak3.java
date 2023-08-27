package d25_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        stampanje("21212341234", "Veljko", "Andjelkovic", "29.01.2000", true);
    }

    public static void stampanje(String jmbg, String ime, String prezime, String godRodjenja, boolean aktivan) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God. rodjenja: " + godRodjenja);
        System.out.println("Aktivan: " + aktivan);
    }
}
