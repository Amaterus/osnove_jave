package p15_08_2023;

public class UvodPromenljive {

    public static void main(String[] args) {

        String firstName; // deklaracija

        firstName = "Veljko"; // inicijalizacija

        String lastName = "Andjelkovic"; // d + i
        int yearOfBirth = 2000;
        int currentYear = 2023;
        double avg = 5.8;
        boolean active = true; // true/false

//        age = 23 + 1; // menjanje inicijalne vrednosti

        int age = currentYear - yearOfBirth;

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Active: " + active);

    }
}
