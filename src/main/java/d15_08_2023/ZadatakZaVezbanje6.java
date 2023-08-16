package d15_08_2023;

public class ZadatakZaVezbanje6 {

    public static void main(String[] args) {


        String naziv = "Tea Tairović - Bibi Habibi (Official Video | Album Balerina)";
        int duzina = 149;
        int fps = 20;
        int duzinaFrame = 1920;
        int visinaFrame = 1080;


        int minimalnaBrzina = fps * duzinaFrame * visinaFrame / 1000000;


        System.out.println("*************************************************************************");
        System.out.println(naziv);
        System.out.println(duzina / 60 + ":" + duzina % 60 + "   <| | | | |");
        System.out.println("Number of frames per second: " + fps);
        System.out.println("Resolution: " + duzinaFrame + "x" + visinaFrame);
        System.out.println("Minimal network speed: " + minimalnaBrzina + "Mb/s");

    }
}
