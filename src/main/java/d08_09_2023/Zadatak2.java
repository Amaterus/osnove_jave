package d08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        FacebookPost post1 = new FacebookPost();
        FacebookPost post2 = new FacebookPost();
        post1.imePrezimeObjavio = "Veljko Andjelkovic";
        post2.imePrezimeObjavio = "Zika Zikic";
        post1.imePrezimeNaProfilu = "Petar Perovic";
        post2.imePrezimeNaProfilu = "Milan Mikic";
        post1.tekstObjave = "Blabla 1";
        post2.tekstObjave = "Blabla 2";

        post1.like();
        post1.like();
        post1.like();
        post1.share();
        post1.print();

        post2.like();
        post2.dislike();
        post2.share();
        post2.print();
    }
    }
