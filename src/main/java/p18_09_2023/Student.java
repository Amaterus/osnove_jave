package p18_09_2023;

public abstract class Student {
    protected String imeIPrezime;
    protected String index;
    protected int godinaStudija;

    public Student(String imeIPrezime, String index, int godinaStudija) {
        this.imeIPrezime = imeIPrezime;
        this.index = index;
        this.godinaStudija = godinaStudija;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public abstract boolean naBudzetu();

    public abstract int cenaSkolarine();

    public void stampaj() {
        System.out.println(this.imeIPrezime +  ", "+this.godinaStudija+", godina studija");

        if (this.naBudzetu()) {
            System.out.println("Finansiranje: budzet");
        } else {
            System.out.println("Finansiranje: samofinansirajuci");
        }
        System.out.println("Cena skolarine: " + this.cenaSkolarine());

    }

}
