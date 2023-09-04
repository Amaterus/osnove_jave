package miniProjekat;

import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//    Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
//
//    Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
//
//    Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
//            generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//            generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//
//            Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
//
//    Glavni program:
//            - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//            - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
//
//    Primer izvršenja 1:
//    Unesite dužinu passworda: 10
//    Da li želite da sadrži specijalan karakter: true
//    Generisan password: eD9Kx0e@
//
//    Primer izvršenja 2:
//    Unesite dužinu passworda: 10
//    Da li želite da sadrži specijalan karakter: false
//    Generisan password: eCxdwEeFEx

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite duzinu passworda: ");
        int duzinaPassworda = s.nextInt();

        System.out.print("Da li želite da sadrži specijalan karakter (true/false): ");
        boolean sadrziSpecijalanKarakter = s.nextBoolean();

        String password = generisiPassword(duzinaPassworda, sadrziSpecijalanKarakter);

        System.out.println("Generisan password: " + password);
    }
    public static char generisiRandomKarakter() {
        String karakteri = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        int indeks = random.nextInt(karakteri.length());
        return karakteri.charAt(indeks);
    }
    public static char generisiRandomSpecijalanKarakter() {
        String specijalniKarakteri = "@#&*!";
        Random random = new Random();
        int indeks = random.nextInt(specijalniKarakteri.length());
        return specijalniKarakteri.charAt(indeks);
    }
    public static String generisiPassword(int duzina, boolean sadrziSpecijalanKarakter) {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < duzina; i++) {
            if (sadrziSpecijalanKarakter && i == duzina - 1) {
                password.append(generisiRandomSpecijalanKarakter());
            } else {
                password.append(generisiRandomKarakter());
            }
        }
        return password.toString();
    }
}
