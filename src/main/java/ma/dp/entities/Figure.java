package ma.dp.entities;


import ma.dp.Observer.Observer;

public abstract class Figure implements Observer {
    public Point point;

    public Figure(Point point){
        this.point = point;
    }

    abstract double surface();
    abstract double perimetre();
    abstract void draw();

}
