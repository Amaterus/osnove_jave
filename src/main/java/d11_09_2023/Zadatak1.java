package d11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Dan", "Bilzerian");
        Autor autor2 = new Autor("Antoan", "Sent");

        Knjiga knjiga1 = new Knjiga("123456789", "The Setup", 2022, autor1);
        Knjiga knjiga2 = new Knjiga("987654321", "Mali Princ", 1943, autor2);

        autor1.stampanje();
        knjiga1.stampanje();

        System.out.println();

        autor2.stampanje();
        knjiga2.stampanje();
    }
}
