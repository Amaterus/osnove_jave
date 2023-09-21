package d18_09_2023;

public class AudioControl extends Control {
    private boolean jeSmanjenoIliPojacano;

    public AudioControl() {
    }

    public AudioControl(boolean jeSmanjenoIliPojacano) {
        this.jeSmanjenoIliPojacano = jeSmanjenoIliPojacano;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer v) {
        if (jeSmanjenoIliPojacano && v.getJacinaZvuka() < 100){
            int zvuk = v.getJacinaZvuka() + 1;
            v.setJacinaZvuka(zvuk);
        } else if (v.getJacinaZvuka() > 0){
            int zvuk = v.getJacinaZvuka() - 1;
            v.setJacinaZvuka(zvuk);
        }
    }
}
