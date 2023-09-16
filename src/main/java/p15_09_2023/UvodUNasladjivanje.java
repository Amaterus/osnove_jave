package p15_09_2023;

public class UvodUNasladjivanje {
    public static void main(String[] args) {
        Auto a = new Auto();
        a.setRegistracija("NI-2921");
        a.setBrojVrata(5);
        a.setBrzina(100);
        a.setMarka("BMW");
        a.stampaj();
        System.out.println();

        Kamion k = new Kamion();
        k.setRegistracija("NI-9393");
        k.setBrzina(120);
        k.setMarka("MAC");
        k.setNosivost(1500);
        k.stampaj();

        System.out.println("KRAJ");

    }
}
