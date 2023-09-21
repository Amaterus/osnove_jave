package d18_09_2023;

public class QualityOptimizerControl extends Control {
    private double brzinaInterneta;

    public QualityOptimizerControl() {
    }

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }


    @Override
    public void izvrsiAkciju(VideoPlayer v) {
        double v1 = this.brzinaInterneta * 10.1;
        if (v1 > 144) {
            v.setKvalitetVidea(240);
        } else if (v1 > 240) {
            v.setKvalitetVidea(720);
        } else if (v1 <= 144){
            v.setKvalitetVidea(144);
        }
    }
}
