package d14_09_2023;

import java.util.ArrayList;

public class Kombinacija {
    private String id;
    private ArrayList<Integer> brojevi;

    public Kombinacija(String id, int jedan, int dva, int tri, int cetiri, int pet, int sest, int sedam) {
        this.id = id;
        brojevi = new ArrayList<>();
        brojevi.add(jedan);
        brojevi.add(dva);
        brojevi.add(tri);
        brojevi.add(cetiri);
        brojevi.add(pet);
        brojevi.add(sest);
        brojevi.add(sedam);
    }

    public boolean daLiJeIstaKombinacija(Kombinacija k) {
        for (int i = 0; i < brojevi.size(); i++) {
            if (brojevi.get(i) != k.brojevi.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void stampaj() {
        System.out.println("ID: " + id);
        System.out.print("brojevi: ");
        for (int i = 0; i < brojevi.size(); i++) {
            System.out.print(brojevi.get(i));
            if (i != brojevi.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
