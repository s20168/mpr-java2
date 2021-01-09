package pl.edu.pjwstk.mpr.exercise1.exercise1.Ex5;

import pl.edu.pjwstk.mpr.exercise1.exercise1.Ex5.Observer


public interface Operator {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
    String getStatus();

}
