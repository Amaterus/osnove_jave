package d25_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {

        stampanjeNKaraktera(5, "*");
    }
    public static void stampanjeNKaraktera(int n, String karakter){
        for (int i = 0; i < n; i++) {
            System.out.print(karakter);
        }
    }
}
