package p25_08_2023;

public class Zadatak6 {


    public static void main(String[] args) {

        int broj1 = 10;
        int suprotniBroj1 = suprotniNegativniBroj(broj1);
        System.out.println("Za broj " + broj1 + " suprotni negativni broj je: " + suprotniBroj1);

        int broj2 = -20;
        int suprotniBroj2 = suprotniNegativniBroj(broj2);
        System.out.println("Za broj " + broj2 + " suprotni negativni broj je: " + suprotniBroj2);
    }
    public static int suprotniNegativniBroj(int n) {
        return -n;
    }
}
