package p18_09_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
        JednakostranicniTrougao trougao = new JednakostranicniTrougao(5);
        Pravougaonik pravougaonik = new Pravougaonik(5, 10);

        trougao.stampaj();
        pravougaonik.stampaj();

        ArrayList<Figura> figure = new ArrayList<>();
        JednakostranicniTrougao t1 = new JednakostranicniTrougao(5);
        figure.add(t1);
        Figura t2 = new JednakostranicniTrougao(10);
        figure.add(t2);
        figure.add(new JednakostranicniTrougao(15));
        figure.add(new Pravougaonik(10, 20));
        figure.add(new Pravougaonik(15, 25));

        for (int i = 0; i < figure.size(); i++) {
            figure.get(i).stampaj();
        }

        double povrsine = 0;
        double obimi = 0;
        for (int i = 0; i < figure.size(); i++) {
            povrsine = povrsine + figure.get(i).povrsina();
            obimi = obimi + figure.get(i).obim();
        }
        System.out.println("Ukupna povrsina je " + povrsine);
        System.out.println("Ukupni obim je " + obimi);




//        figure.ad




    }
}
