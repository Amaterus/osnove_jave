package d11_09_2023;

public class YoutubePlayer {
    private Video video;
    private int kvalitet;
    private String rezim;
    private int jacinaZvuka;
    private int trenutnoVremeReprodukcije;

    public YoutubePlayer() {
        this.jacinaZvuka = 75;
        this.kvalitet = 144;
        this.rezim = "mini player";
    }

    public YoutubePlayer(Video video, int kvalitet, String rezim, int jacinaZvuka, int trenutnoVremeReprodukcije){
        this.video = video;
        this.kvalitet = kvalitet;
        this.rezim = rezim;
        this.jacinaZvuka = jacinaZvuka;
        this.trenutnoVremeReprodukcije = trenutnoVremeReprodukcije;
    }

    public Video getVideo() {
        return this.video;
    }

    public int getKvalitet() {
        return this.kvalitet;
    }

    public String getRezim() {
        return this.rezim;
    }

    public int getJacinaZvuka() {
        return this.jacinaZvuka;
    }

    public int getTrenutnoVremeReprodukcije() {
        return this.trenutnoVremeReprodukcije;
    }

    public void ucitajVideo(Video v) {
        v.pogledaj();
        this.trenutnoVremeReprodukcije = 0;
    }

    public void pojacaj() {
        if (this.jacinaZvuka < 100) {
            this.jacinaZvuka = this.jacinaZvuka + 10;
        }
    }

    public void smanji() {
        if (this.jacinaZvuka > 0) {
            this.jacinaZvuka = this.jacinaZvuka - 10;
        }
    }

    public void postaviKvalitet(int brzinaInterneta) {
        if (brzinaInterneta < 2) {
            this.kvalitet = 144;
        } else if (brzinaInterneta <= 4) {
            this.kvalitet = 240;
        } else if (brzinaInterneta <= 6) {
            this.kvalitet = 360;
        } else if (brzinaInterneta <= 8) {
            this.kvalitet = 720;
        } else if (brzinaInterneta > 8) {
            this.kvalitet = 1080;
        }
    }

    public void aktivirajMiniPlayerMod() {
        this.rezim = "mini player";
    }

    public void aktivirajBioskopskiMod() {
        this.rezim = "bioskopski rezim";
    }

    public void aktivirajPrekoCelogEkranaMod() {
        this.rezim = "preko celog ekrana";
    }

    public void premotajUnapred() {
        if (this.trenutnoVremeReprodukcije < video.getDuzinaUSekundama()) {
            this.trenutnoVremeReprodukcije = this.trenutnoVremeReprodukcije + 10;
        }
    }

    public void premotajUnazad() {
        if (this.trenutnoVremeReprodukcije > 0) {
            this.trenutnoVremeReprodukcije = this.trenutnoVremeReprodukcije - 10;
        }
    }

    public void iscrajZvuk() {
        System.out.print("Zvuk ");
        for (int i = 0; i < this.jacinaZvuka; i = i + 10) {
            System.out.print("|");
        }
    }

    public void iscrtajRezim() {
        System.out.print("Rezim: ");
        if (this.rezim.equals("mini player")) {
            System.out.println("[]");
        } else if (this.rezim.equals("bioskopski rezim")) {
            System.out.println("[..]");
        } else if (this.rezim.equals("preko celog ekrana")) {
            System.out.println("[|||]");
        }
    }

    public void iscrtajTrenutnoVreme() {
        int minut = this.trenutnoVremeReprodukcije / 60;
        int sekund = this.trenutnoVremeReprodukcije % 60;
        int minutUkupnogVidea = video.getDuzinaUSekundama() / 60;
        int sekundUkupnogVidea = video.getDuzinaUSekundama() % 60;

        System.out.println(minut + ":" + sekund + "/" + minutUkupnogVidea + ":" + sekundUkupnogVidea);
    }

    public void iscrtajTimeline() {
        System.out.print("Timeline: ");
        int brojZvezdica = this.trenutnoVremeReprodukcije * 100 / video.getDuzinaUSekundama();
        int brojTackica = 100 - brojZvezdica;

        for (int i = 0; i < brojZvezdica; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < brojTackica; i++) {
            System.out.print(".");
        }
    }
    public void iscitaj() {
        this.iscrtajTrenutnoVreme();
        System.out.println();
        this.iscrajZvuk();
        System.out.println();
        this.iscrtajTimeline();
        System.out.println();
        System.out.println("Kvalitet: " + this.kvalitet);
        System.out.println();
        this.iscrtajRezim();
        System.out.println(video.getNaziv());
        System.out.println("Likes: " + video.getBrojLajkova() + "|" + "Dislikes: " + video.getBrojDislajkova());
        System.out.println(video.getBrojPregleda() + " Pregleda");
    }
    public void sherovanjeVidea() {
        System.out.println("https://youtu.be/" + video.getId());
    }
}
