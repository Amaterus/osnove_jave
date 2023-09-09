package p08_09_2023;

public class Auto {
    public String vozac;
    public String marka;
    public int brojVrata;
    public double potrosnjaNa100Km;
    public int trenutnaBrzina;
    public int godinaProizvodnje;
    public int mesecRegistracije;
    public int kubikaza;
    public String brojRegistracije;
    public boolean ukljucenaKlima;
    public int maksimalnaBrzina;

    public void stampanje() {
        System.out.println(this.vozac);
        System.out.println(this.marka + " - " + this.brojVrata + "-ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnjaNa100Km + " l na 100km");
        System.out.println(this.trenutnaBrzina + " km/h je trenutna brzina.");
    }

    public boolean prekoracenjeBrzine(int ogranicenje) {
        return this.trenutnaBrzina > ogranicenje;
    }

    public int izracunajKaznu(int ogranicenje) {
        if (this.prekoracenjeBrzine(ogranicenje)) {
            int prekoracenje = this.trenutnaBrzina - ogranicenje;
            return prekoracenje * 1000;
        } else {
            return 0;
        }
    }
    public boolean jeOldtimer() {
        return this.godinaProizvodnje < 1950;
    }
    public boolean isteklaRegistracija(int trenutniMesec) {
        return trenutniMesec > this.mesecRegistracije;
    }

    public double cenaRegistracije() {
        double cena = this.kubikaza * 100;
        if (this.kubikaza > 2000) {
            cena += cena * 0.3;
        }
        return cena;
    }

    public int dodajGas() {
        if (this.trenutnaBrzina > this.maksimalnaBrzina) {
           return this.trenutnaBrzina = this.maksimalnaBrzina;
        } else {
            return this.trenutnaBrzina + 10;
        }
    }

    public int koci() {
        if (this.trenutnaBrzina < 0 ) {
            return this.trenutnaBrzina = 0;
        } else {
            return this.trenutnaBrzina = this.trenutnaBrzina - 10;
        }
    }

    public double trenutnaPotrosnjaAuta() {
        double faktor;
        if (ukljucenaKlima){
            faktor = faktor = 1.2;
        } else {
            faktor =  faktor = 1.0;
        }
        return this.trenutnaBrzina / 100.0 * this.potrosnjaNa100Km * faktor;
    }

    public void stampajTablu() {
        int brojCrtica = (this.trenutnaBrzina * 100) / this.maksimalnaBrzina;
        int brojTacaka = 100 - brojCrtica;

        for (int i = 0; i < brojCrtica; i++) {
            System.out.print("|");
        }
        for (int i = 0; i < brojTacaka; i++) {
            System.out.print(".");
        }
        System.out.println(this.trenutnaBrzina + "/" + this.maksimalnaBrzina + "km/h");
    }
}


