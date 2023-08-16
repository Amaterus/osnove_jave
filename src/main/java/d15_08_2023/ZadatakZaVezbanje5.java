package d15_08_2023;

public class ZadatakZaVezbanje5 {

    public static void main(String[] args) {

        String nazivSlike = "profile-image.png";
        int duzina = 1920;
        int visina = 1080;
        double faktorSkaliranja = 1.3;

        double novaDuzinaSlike = duzina * faktorSkaliranja;
        double novaVisinaSlike = visina * faktorSkaliranja;

        double originalnaVelicina = (duzina * visina) / (1024.0 * 1024.0);
        double novaVelicina = (novaDuzinaSlike * novaVisinaSlike) / (1024.0 * 1024.0);

        System.out.println("Original image: " + nazivSlike + ", " + "Size: " + originalnaVelicina + "Mb");
        System.out.println("Scale: " + faktorSkaliranja);
        System.out.println("Resized image: " + "resized-" + nazivSlike + " Size: " + novaVelicina + "Mb");
        System.out.println("| Click here to Download image |");
    }

}
