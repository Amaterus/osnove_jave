package d15_09_2023.Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);

        ArrayList<Igrac> igraci = new ArrayList<>();
        ArrayList<Trener> treneri = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Igrac igrac = new Igrac();

            System.out.println("Unesite ime i prezime igraca " + (i + 1) + ":");
            igrac.setPunoIme(s.nextLine());

            System.out.println("Unesite JMBG igraca " + (i + 1) + ":");
            igrac.setJmbg(s.nextLine());

            System.out.println("Unesite godinu rodjenja igraca " + (i + 1) + ":");
            igrac.setGodinaRodjenja(s.nextInt());
            s.nextLine();

            System.out.println("Unesite broj igraca " + (i + 1) + ":");
            igrac.setBroj(s.nextInt());
            s.nextLine();

            System.out.println("Unesite poziciju igraca " + (i + 1) + ":");
            igrac.setPozicija(s.nextLine());

            System.out.println("Da li je igrac " + (i + 1) + " kapiten (true/false):");
            igrac.setJeKapiten(s.nextBoolean());
            s.nextLine();

            igraci.add(igrac);
        }

        for (int i = 0; i < 2; i++) {
            Trener trener = new Trener();

            System.out.println("Unesite ime i prezime trenera " + (i + 1) + ":");
            trener.setPunoIme(s.nextLine());

            System.out.println("Unesite JMBG trenera " + (i + 1) + ":");
            trener.setJmbg(s.nextLine());

            System.out.println("Unesite godinu rodjenja trenera " + (i + 1) + ":");
            trener.setGodinaRodjenja(s.nextInt());
            s.nextLine();

            System.out.println("Unesite godine iskustva trenera " + (i + 1) + ":");
            trener.setGodineIskustva(s.nextInt());
            s.nextLine();

            System.out.println("Unesite tip trenera " + (i + 1) + ":");
            trener.setTip(s.nextLine());

            treneri.add(trener);
        }

        System.out.println("Igraci:");
        for (int i = 0; i < igraci.size(); i++) {
            Igrac igrac = igraci.get(i);
            igrac.stampaj();
            System.out.println();
        }

        System.out.println("Treneri:");
        for (int i = 0; i < treneri.size(); i++) {
            Trener trener = treneri.get(i);
            trener.stampaj();
            System.out.println();
        }
    }
}
