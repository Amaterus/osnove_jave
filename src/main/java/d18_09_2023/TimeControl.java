package d18_09_2023;

public class TimeControl extends Control {
    private boolean naKojuStranu;

    public TimeControl() {
    }

    public TimeControl(boolean naKojuStranu) {
        this.naKojuStranu = naKojuStranu;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer v) {
        if (this.naKojuStranu && (v.getDuzinaVidea() - v.getTrenutnoVremeVidea()) >= 15){
            int i = v.getTrenutnoVremeVidea() + 15;
            v.setTrenutnoVremeVidea(i);
        } else if (v.getTrenutnoVremeVidea() >= 15) {
            int i = v.getTrenutnoVremeVidea() - 15;
            v.setTrenutnoVremeVidea(i);
        }
    }
}
