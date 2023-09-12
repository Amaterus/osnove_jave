package d11_09_2023;

public class Knjiga {
    private String ISBN;
    private String naziv;
    private int godinaIzdanja;
    private Autor autor;

    public Knjiga() {

    }

    public Knjiga(String ISBN, String naziv, int godinaIzdanja, Autor autor) {
        this.ISBN = ISBN;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void stampanje() {
        System.out.println(ISBN);
        System.out.println(naziv + " - " + godinaIzdanja);
        System.out.print("autor: ");
        autor.stampanje();
    }
}
