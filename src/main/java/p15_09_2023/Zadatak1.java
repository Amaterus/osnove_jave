package p15_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

//        Kreirati klasu Osoba koja od atributa ima:
//        ime i prezime
//                jmbg
//        konstuktor sa parametrima
//        difoltni konstuktor
//        metodu stampaj koja stampa podatke u formatu
//        ime prezime, jmbg
//
//
//        Kreirati klasu Student koja nasledjuje klasu Osoba,
//                koja od dodatnih atributa ima:
//        broj indeksa
//        dug za skolarinu
//        konstuktor sa parametrima
//        difoltni konstuktor
//        metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//                Napisati metod stampajStudenta da stampa sve podatke o studentu
//
//
//        Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//                koja od dodatnih atributa ima:
//        naziv predmeta koji predaje
//        iznos plate
//        konstuktor sa parametrima
//        difoltni konstuktor
//        metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//        Napisati metodu stampajProfu da stampa sve podatke o profesoru
//
//
//        U glavnom programu kreirati 2 studenta i 2 profesora.

//        Prilagodite konstuktore
//        Overide-tujte metodu za stampu iz osnovne klase

        Student student1 = new Student("Veljko", "Andjelkovic", "545345345", 16998, 23423);
        Student student2 = new Student("Pera", "Peric", "987654321", 42344, 23223);

        Profesor profesor1 = new Profesor("Zika", "Zikic", "34234234", "Matematika", 70500);
        Profesor profesor2 = new Profesor("Marko", "Markovic", "444555666", "Fizika", 55320);

        student1.stampaj();
        System.out.println();
        student2.stampaj();
        System.out.println();
        profesor1.stampaj();
        System.out.println();
        profesor2.stampaj();
    }
}
