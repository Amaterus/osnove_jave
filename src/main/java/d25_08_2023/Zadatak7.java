package d25_08_2023;

public class Zadatak7 {
    public static void main(String[] args) {
        int broj1 = 4;
        int broj2 = 6;
        int broj3 = 1;

        int najmanji = pronadjiNajmanji(broj1, broj2, broj3);

        System.out.println("Najmanji broj je: " + najmanji);
    }

    public static int pronadjiNajmanji(int broj1, int broj2, int broj3) {
        int najmanji = broj1;

        if (broj2 < najmanji) {
            najmanji = broj2;
        }

        if (broj3 < najmanji) {
            najmanji = broj3;
        }
        return najmanji;
    }
}

