package d12_09_2023;

public class Zadatak4 {
    public static void main(String[] args) {

        Ringla ringla1 = new Ringla("obicna", 3, 10.0);
        Ringla ringla2 = new Ringla("obicna", 2, 13.0);
        Ringla ringla3 = new Ringla("obicna", 1, 11.0);
        Ringla ringla4 = new Ringla("ekspres", 12, 7.0);

        ElektricniSporet sporet = new ElektricniSporet("Beko", 3, 4, ringla1, ringla2, ringla3, ringla4);
        sporet.pojacajRinglu(2);
        System.out.println(ringla2.getJacina());
        System.out.println(sporet.potrosnjaZaSveRingle(5, 2, 3, 4));
    }
}
