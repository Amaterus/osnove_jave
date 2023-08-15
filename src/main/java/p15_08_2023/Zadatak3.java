package p15_08_2023;

public class Zadatak3 {

    public static void main(String[] args) {

//        Napisati program koji na ekranu stampa podatke u formatu:
//[IME I PREZIME]
//[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//[EMAIL]

        String imeIPrezime = "Veljko Andjelkovic";
        String brojTelefona = "064434432323";
        String ulicaIBroj = "Knez Mihajlova 12";
        String grad = "Prokuplje";
        String email = "veljkoandjelkovic2000@gmail.com";

        System.out.println(imeIPrezime);
        System.out.println(brojTelefona + ", " + ulicaIBroj + ", " + " " + grad);
        System.out.println(email);

    }
}
