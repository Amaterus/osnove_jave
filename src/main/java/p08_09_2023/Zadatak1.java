package p08_09_2023;


public class Zadatak1 {
    public static void main(String[] args) {
        SlackMessage poruka1 = new SlackMessage();
        poruka1.tekst = "Blabla";
        poruka1.imeIPrezime = "Veljko Andjelkovic";
        poruka1.datumIVreme = "26.08.2021 18:55";

        SlackMessage poruka2 = new SlackMessage();
        poruka2.tekst = "Blabla";
        poruka2.imeIPrezime = "Zika Zikic";
        poruka2.datumIVreme = "27.08.2021 10:30";

        poruka1.stampanjePoruke();
        System.out.println();
        poruka2.stampanjePoruke();

        poruka1.azurirajPoruku("novo bla bla ", "12.12.2023");
        poruka1.stampanjePoruke();

        String convertedInfo = poruka1.convertToString();
        System.out.println(convertedInfo);
    }

}

