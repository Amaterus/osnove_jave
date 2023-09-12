package p12_09_2023;


public class Zadatak1 {
    public static void main(String[] args) {

        Kartica superKartica = new Kartica();
        superKartica.setBroj("0238-329328-32");
        superKartica.setPopust(10);


        Kupac milan = new Kupac("Milan Jovanovic", superKartica);

        Proizvod grandKafa = new Proizvod("Grand kafa 100g", 100);
        grandKafa.setKupac(milan);
        grandKafa.stampaj();


//        Kartica k = milan.getKartica();
//        System.out.println(k.getPopust());

//        System.out.println(milan.getKartica().getPopust());




    }
}
