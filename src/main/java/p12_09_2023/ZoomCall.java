package p12_09_2023;

public class ZoomCall {
    private String url;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public ZoomCall(String url, String password, Korisnik host) {
        this.url =url;
        this.password = password;
        this.host = host;
    }

    public ZoomCall(String url, String password, Korisnik host, Korisnik guest) {
        this.url =url;
        this.password = password;
        this.host = host;
        this.guest = guest;
    }

    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }

    public String getUrl() {
        return url;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getHost() {
        return host;
    }

    public Korisnik getGuest() {
        return guest;
    }


    public void pokreniPoziv() {
        System.out.println("URL: "+ this.url);
        System.out.println("PASSWORD: " + this.password);
        System.out.println("HOST: " + this.host.getImeIPrezime());
        if (this.guest != null ) {
//            System.out.println("GUEST: " + this.guest.getImeIPrezime());
            System.out.println("GUEST: " + this.guest.getImeIPrezime());
        }

    }


}
