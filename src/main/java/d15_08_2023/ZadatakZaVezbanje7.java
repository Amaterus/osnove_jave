package d15_08_2023;

public class ZadatakZaVezbanje7 {

    public static void main(String[] args) {

        String nazivTelefona = "Iphone 11 pro max";
        int kapacitetBaterije = 3000;
        int trenutnaNapunjenost = 20;
        int strujaPunjenja = 1000;

        int potrebnomAh = kapacitetBaterije * (100 - trenutnaNapunjenost) / 100;

        double vremePunjenja = potrebnomAh / strujaPunjenja;

        System.out.println("Naziv telefona: " + nazivTelefona);
        System.out.println("Kapacitet baterije: " + kapacitetBaterije + "mAh");
        System.out.println("Baterija trenutno na " + trenutnaNapunjenost + "%");
        System.out.println("Struja punjenja " + strujaPunjenja + "mA");

        System.out.println("Procenjeno vreme punjenja je " + vremePunjenja + "h.");


    }
}
