package p18_09_2023;

public class StudentOsnovnih extends Student{

    public StudentOsnovnih(String imeIPrezime, String index, int godinaStudija) {
        super(imeIPrezime, index, godinaStudija);
    }

    @Override
    public boolean naBudzetu() {
        return this.godinaStudija < 5;
    }

    @Override
    public int cenaSkolarine() {
        return 90000;
    }

}
