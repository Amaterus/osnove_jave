package p18_09_2023;

public class StudentMaster extends Student{

    public StudentMaster(String imeIPrezime, String index, int godinaStudija) {
        super(imeIPrezime, index, godinaStudija);
    }

    @Override
    public boolean naBudzetu() {
        return this.godinaStudija < 2;
    }

    @Override
    public int cenaSkolarine() {
        return 100000;
    }
}
