package d11_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        Video video = new Video("v6tuOipj5mk ", " Ariana Grande - positions (official video)", 123, 1000, 1500, 1000000);
        YoutubePlayer player = new YoutubePlayer(video, 1080, "mini player", 95, 100);

       player.iscitaj();
       player.sherovanjeVidea();
    }
}
