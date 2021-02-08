package ma.dp.Exam.entities;

import ma.dp.Exam.Observable.Observable;
import ma.dp.Exam.Observer.Observer;

import java.util.List;


public class Parametrage implements Observable {

    private int epaisseurContour;
    private int couleurContour;
    private int couleurRemplissage;
    List<Observer> observerList;

    @Override
    public void subscribe(Observer observable) {
        observerList.add(observable);
    }

    @Override
    public void unsubscribe(Observer observable) {
        observerList.remove(observable);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observerList){
            o.update(this);
        }
    }

    public int getCouleurContour() {
        return couleurContour;
    }

    public int getCouleurRemplissage() {
        return couleurRemplissage;
    }

    public int getEpaisseurContour() {
        return epaisseurContour;
    }
}
