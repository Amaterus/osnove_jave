package d15_08_2023;

public class ZadatakZaVezbanje4
{


    public static void main(String[] args) {

        String naziv = "profile-image.log";
        int duzina = 1920;
        int visina = 1080;


        int pikseli = duzina * visina;
        int bajti = pikseli;


        int kilobajti = bajti / 1024;
        double megabajti = kilobajti / 1024.0;

        System.out.println("File: " + naziv);
        System.out.println("Resolution: " + duzina + " x " + visina);
        System.out.println("Size (kb): " + kilobajti);
        System.out.println("Size (Mb): " + megabajti);
    }
}
