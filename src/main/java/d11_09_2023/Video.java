package d11_09_2023;

public class Video {
    private String id;
    private String naziv;
    private int duzinaUSekundama;
    private int brojLajkova;
    private int brojDislajkova;
    private int brojPregleda;

    public Video(){

    }

    public Video(String id, String naziv, int duzinaUSekundama, int brojLajkova, int brojDislajkova, int brojPregleda){
        this.id = id;
        this.naziv = naziv;
        this.duzinaUSekundama = duzinaUSekundama;
        this.brojLajkova = brojLajkova;
        this.brojDislajkova = brojDislajkova;
        this.brojPregleda = brojPregleda;
    }

    public void lajkuj() {
        this.brojLajkova++;
    }

    public void dislajkuj() {
        this.brojDislajkova++;
    }

    public void pogledaj() {
        this.brojPregleda++;
    }

    public String getId(){
        return this.id ;
    }
    public String getNaziv(){
        return this.naziv;
    }
    public int getDuzinaUSekundama(){
        return this.duzinaUSekundama;
    }
    public int getBrojLajkova(){
        return this.brojLajkova;
    }
    public int getBrojDislajkova(){
        return this.brojDislajkova;
    }
    public int getBrojPregleda(){
        return this.brojPregleda;
    }
}
