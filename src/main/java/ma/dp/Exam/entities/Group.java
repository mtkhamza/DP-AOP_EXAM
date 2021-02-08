package ma.dp.Exam.entities;

import ma.dp.Exam.Observable.Observable;

import java.util.ArrayList;
import java.util.List;

public class Group extends Figure {

    List<Figure> list = new ArrayList<>();

    public Group(Point point) {
        super(point);
    }

    @Override
    public void update(Observable observable) {
        for (Figure f : list) {
           f.update(observable);
        }
    }

    @Override
    double surface() {
        double sumSurfaces = 0.0;
        for (Figure f : list) {
            sumSurfaces += f.surface();
        }
        return sumSurfaces;
    }

    @Override
    double perimetre() {
        double sumPerimetre = 0.0;
        for (Figure f : list) {
            sumPerimetre += f.perimetre();
        }
        return sumPerimetre;
    }

    @Override
    void draw() {
        for (Figure f : list) {
            f.draw();
        }
    }
}
