package p25_08_2023;

public class Zadatak7 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        boolean daLiJePravougli = pravougliTrougao(a, b, c);
        if (daLiJePravougli) {
            System.out.println("Trougao je pravougli.");
        } else {
            System.out.println("Trougao nije pravougli.");
        }
    }
    public static boolean pravougliTrougao(int a, int b, int c) {
        return a * a + b * b == c * c;
    }
}

