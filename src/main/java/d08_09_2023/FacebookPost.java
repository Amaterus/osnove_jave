package d08_09_2023;

public class FacebookPost {
    public String imePrezimeObjavio;
    public String imePrezimeNaProfilu;
    public String tekstObjave;
    public int brojLajkova;
    public int brojDeljenja;

    public void like() {
        brojLajkova++;
    }

    public void dislike() {
        if (brojLajkova > 0) {
            brojLajkova--;
        }
    }

    public void share() {
        brojDeljenja++;
    }

    public void print() {
        System.out.println(imePrezimeObjavio + " >>> " + imePrezimeNaProfilu);
        System.out.println(tekstObjave);
        System.out.println("Lajkova " + brojLajkova + " | Deljenja " + brojDeljenja);
        System.out.println();
    }
}
