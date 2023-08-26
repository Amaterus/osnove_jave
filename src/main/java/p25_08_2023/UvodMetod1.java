package p25_08_2023;

public class UvodMetod1 {

    public static void main(String[] args) {

        String ime = "Veljko";
        String prezime = "Andjelkovic";
        boolean aktivan = true;

        printUser(ime, prezime, aktivan);
        printUser("Velja", "Nevolja", true);
        printUser("Pera", "Peric", false);
    }

    public static void printUser(String firstName ,String lastName, Boolean active) {
        if (active){
            System.out.print("o ");
        } else {
            System.out.print("x ");
        }
        System.out.println(firstName + " " + lastName);
    }
}
