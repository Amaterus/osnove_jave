package d15_08_2023;

public class ZadatakZaVezbanje {

    public static void main(String[] args) {

        int originalnaBojaRed = 140;
        int originalnaBojaGreen = 12;
        int originalnaBojaBlue = 100;

        int kontrasnaBojaRed = 255 - originalnaBojaRed;
        int kontrasnaBojaGreen = 255 - originalnaBojaGreen;
        int kontrasnaBojaBlue = 255 - originalnaBojaBlue;

        System.out.println("Originalna boja: RGB (" + originalnaBojaRed + ", " + originalnaBojaGreen + ", "+ originalnaBojaBlue +")");
        System.out.println("Kontrasna boja: RGB (" + kontrasnaBojaRed + ", " + kontrasnaBojaGreen + ", " + kontrasnaBojaBlue + ")");

    }
}