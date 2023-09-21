package d18_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        VideoPlayer player1 = new VideoPlayer(210, 120, 60, 240);
        player1.stampaj();

        AudioControl kontrola = new AudioControl(true);
        kontrola.izvrsiAkciju(player1);
        player1.stampaj();

        QualityOptimizerControl optimizer = new QualityOptimizerControl(50);
        player1.stampaj();

        TimeControl kontrolaVremena = new TimeControl(true);
        kontrolaVremena.izvrsiAkciju(player1);
        player1.stampaj();
    }
}
