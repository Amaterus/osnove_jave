package d14_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        {

            Student student = new Student("16998", "Veljko Andjelkovic", "Osnovne studije");
            student.dodajIspit(new Ispit("Informatika", 8, "Darko Puflovic"));
            student.dodajIspit(new Ispit("Algoritmi i programiranje", 7, "Leonid"));
            student.dodajIspit(new Ispit("Informatika", 9, "Profesor C"));


            student.stampaj();
        }
    }
}
