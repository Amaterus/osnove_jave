package p18_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        StudentOsnovnih so = new StudentOsnovnih("Milan Jovanovic",
                "12921", 3);

        StudentMaster sm = new StudentMaster("Pera Peric", "320923", 2);

        so.stampaj();
        sm.stampaj();
    }
}
