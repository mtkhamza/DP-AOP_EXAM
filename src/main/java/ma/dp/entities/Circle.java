package ma.dp.entities;

import ma.dp.Observable.Observable;

public class Circle extends Figure {

    private double rayon;

    public Circle(Point point, double rayon) {
        super(point);
        this.rayon = rayon;
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
        return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public void draw() {
        System.out.println("Drawing cirle with R = " + rayon + ", Surface : " + this.surface() + " and Perimetre :" + this.perimetre());
    }
}
