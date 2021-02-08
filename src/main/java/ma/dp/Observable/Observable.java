package ma.dp.Observable;

import ma.dp.Observer.Observer;

public interface Observable {
    public void subscribe(Observer observable);
    public void unsubscribe(Observer observable);
    public void notifyObservers();
}

