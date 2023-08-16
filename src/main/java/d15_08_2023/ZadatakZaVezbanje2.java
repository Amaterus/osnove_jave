package d15_08_2023;

public class ZadatakZaVezbanje2 {

        public static void main(String[] args) {

            String nazivFajla = "profile-image.png";
            double original = 7;
            double skinuto = 2;

            double procenat = (skinuto / original) * 100;

            System.out.println(nazivFajla + " " + original + "Mb/" + skinuto + "Mb");
            System.out.println("*****************************");
            System.out.println("*********** " + procenat + "%");
            System.out.println("*****************************");
        }
    }

