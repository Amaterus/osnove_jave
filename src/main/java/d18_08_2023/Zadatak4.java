package d18_08_2023;


public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji stampa 25 _ (donjih crta), pritom na svaku 5. iteraciju odstampa i novi red. Zadatak resiti pomocu FOR petlje.
//                Primer izvrsenja:
//        _ _ _ _ _
//        _ _ _ _ _
//        _ _ _ _ _
//        _ _ _ _ _
//        _ _ _ _ _


        int brojac = 0;

        for (int i = 0; i < 25; i++) {
            System.out.print("_ ");
            brojac++;

            if (brojac % 5 == 0) {

                System.out.println();


            }
        }
    }
}

