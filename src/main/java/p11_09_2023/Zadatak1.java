package p11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setIme("Veljko");
        student.setPrezime("Andjelkovic");
        student.setBrojIndeksa(16998);
        student.setNaBudzetu(true);

        System.out.println("Ime studenta: " + student.getIme());
        System.out.println("Prezime studenta: " + student.getPrezime());
        System.out.println("Broj indeksa studenta: " + student.getBrojIndeksa());
        System.out.println("Da li je student na budzetu? " + student.getNaBudzetu());

        System.out.println();
        student.setIme("Zika");
        student.setNaBudzetu(false);

        System.out.println("Novo ime studenta: " + student.getIme());
        System.out.println("Da li je student sada na budzetu? " + student.getNaBudzetu());
        student.stampa();
    }
}
