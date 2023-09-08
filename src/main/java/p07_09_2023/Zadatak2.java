package p07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        SlackMessage prva = new SlackMessage();
        prva.imeIPrezime = "Veljko Andjelkovic";
        prva.tekst = "blabla";
        prva.datumIVreme = "07.09.2023 20:55";

        SlackMessage druga = new SlackMessage();
        druga.imeIPrezime = "Pera Peric";
        druga.tekst = "blabla";
        druga.datumIVreme = "07.11.2023 21:32";

        System.out.println(prva.imeIPrezime + " " + prva.datumIVreme);
        System.out.println(prva.tekst);
        System.out.println(druga.imeIPrezime + " " + druga.datumIVreme);
        System.out.println(druga.tekst);
    }
}
