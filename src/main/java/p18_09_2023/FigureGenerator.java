package p18_09_2023;

public class FigureGenerator {
    public static Figura generisiFiguru(String tipFigure) {
        if (tipFigure.equals("trougao")) {
            return new JednakostranicniTrougao(5);
        } else if (tipFigure.equals("pravougaonik")) {
            return new Pravougaonik(5, 10);
        }
        return null;
    }

//    public static Figura generisiFiguru(String tipFigure) {
//        if (tipFigure.equals("trougao")) {
//            return new JednakostranicniTrougao(5);
//        } else if (tipFigure.equals("pravougaonik")) {
//            return new Pravougaonik(5, 10);
//        }
//        return null;
//    }
}
