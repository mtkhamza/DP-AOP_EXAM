package ma.dp.entities;

import ma.dp.Observable.Observable;
import ma.dp.Observer.Observer;
import ma.dp.aspects.MyLog;

import java.util.ArrayList;
import java.util.List;

public class Parametrage implements Observable {

    private int epaisseurContour;
    private int couleurContour;
    private int couleurRemplissage;
    List<Observer> observerList = new ArrayList<>();

    public Parametrage(int ec, int cc, int cr){
        this.epaisseurContour = ec;
        this.couleurContour = cc;
        this.couleurRemplissage =  cr;
    }
    @MyLog
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

    public void setCouleurContour(int couleurContour) {
        this.couleurContour = couleurContour;
    }

    public void setCouleurRemplissage(int couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
    }

    public void setEpaisseurContour(int epaisseurContour) {
        this.epaisseurContour = epaisseurContour;
    }
}
