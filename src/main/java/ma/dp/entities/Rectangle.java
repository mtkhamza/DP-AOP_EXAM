package ma.dp.entities;

import ma.dp.Observable.Observable;

public class Rectangle extends Figure {

    private double L;
    private double H;

    public Rectangle(Point point, double L, double H) {
        super(point);
        this.L = L;
        this.H = H;
    }

    @Override
    public void update(Observable observable) {
        System.out.println("Updated values are :");
        System.out.println("Couleur Contour : " + ((Parametrage) observable).getCouleurContour());
        System.out.println("Epaisseur Contour : " + ((Parametrage) observable).getEpaisseurContour());
        System.out.println("Couleur Remplissage : " + ((Parametrage) observable).getCouleurRemplissage());
    }

    @Override
    public double surface() {
        return L * H;
    }

    @Override
    public double perimetre() {
        return 2 * (L + H);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with L : " + L + ", H :" + H + ", Perimetre :" + this.perimetre() + " and Surface :" + this.surface());
    }
}
