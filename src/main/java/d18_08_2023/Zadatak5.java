package d18_08_2023;

public class Zadatak5 {

    public static void main(String[] args) {

        int negativniBrojevi;

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                negativniBrojevi = -i;
                System.out.println(negativniBrojevi);
            }
            else {
                System.out.println(i);
            }
        }

    }
}
