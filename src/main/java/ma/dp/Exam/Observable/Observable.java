package ma.dp.Exam.Observable;

import ma.dp.Exam.Observer.Observer;

public interface Observable {
    public void subscribe(Observer observable);
    public void unsubscribe(Observer observable);
    public void notifyObservers();
}

