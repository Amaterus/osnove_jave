package p25_08_2023;

public class Zadatak4 {

    public static void main(String[] args) {

//        Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja. Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.
        operacije(10, 5);
        operacije(15, 3);
        operacije(8, 2);
    }
    public static void operacije(int a, int b) {
        int zbir = a + b;
        int razlika = a - b;
        int proizvod = a * b;
        int kolicnik = a / b;

        System.out.println("Zbir: " + zbir);
        System.out.println("Razlika: " + razlika);
        System.out.println("Proizvod: " + proizvod);
        System.out.println("Kolicnik: " + kolicnik);
        System.out.println();
    }
}
