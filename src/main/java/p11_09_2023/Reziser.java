package p11_09_2023;
public class Reziser {
    private String imePrezime;
    private int starost;

    public Reziser(String imePrezime, int starost) {
        this.imePrezime = imePrezime;
        this.starost = starost;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public void print() {
        System.out.println(imePrezime + ", " + starost + " godina");
    }
}
