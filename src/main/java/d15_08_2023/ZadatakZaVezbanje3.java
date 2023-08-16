package d15_08_2023;

public class ZadatakZaVezbanje3 {

    public static void main(String[] args) {

        String nazivFajla = "profile-image.log";
        int velicinaFajla = 25;
        int brzinaSkidanja = 3;
        int preostaloVremeSkidanja = velicinaFajla / brzinaSkidanja;

        System.out.println("File: " + nazivFajla );
        System.out.println("Size: " + velicinaFajla + "Mb");
        System.out.println("Download speed: " + brzinaSkidanja + "MB/s");
        System.out.println("Estimated time: " + preostaloVremeSkidanja + "s");

    }
}
