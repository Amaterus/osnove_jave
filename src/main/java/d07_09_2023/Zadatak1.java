package d07_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.ime = "Veljko";
        student1.brojIndeksa = 59822;
        student1.fakultet = "Elektronski fakultet";

        Student student2 = new Student();
        student2.ime = "Pera";
        student2.brojIndeksa = 59423;
        student2.fakultet = "Racunarski fakultet";

        Student student3 = new Student();
        student3.ime = "Zika";
        student3.brojIndeksa = 32123;
        student3.fakultet = "Fakultet politickih nauka";

        System.out.println("Ime studenta " + student1.ime + ", broj indeksa "+ student1.brojIndeksa + " i fakultet " + student1.fakultet);
        System.out.println("Ime studenta " + student2.ime + ", broj indeksa "+ student2.brojIndeksa + " i fakultet " + student2.fakultet);
        System.out.println("Ime studenta " + student3.ime + ", broj indeksa "+ student3.brojIndeksa + " i fakultet " + student3.fakultet);

    }
}
