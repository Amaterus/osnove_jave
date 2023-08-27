package d25_08_2023;

public class Zadatak6 {
    public static void main(String[] args) {
        int brojM = 5;
        int brojN = 10;

        int rezultat = izbroji(brojM, brojN);
        System.out.println("izbroji(" + brojM + ", " + brojN + ") ima za rezultat " + rezultat);
    }

    public static int izbroji(int m, int n) {
        if (m > n) {
            return m - n + 1;
        }

        return n - m + 1;
    }
}





