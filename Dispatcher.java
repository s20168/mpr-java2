package pl.edu.pjwstk.mpr.exercise1.exercise1.Ex5;
import pl.edu.pjwstk.mpr.exercise1.exercise1.Ex5.Observer;
import java.util.List;
import java.util.ArrayList;

public class Dispatcher implements Operator {
    List<Observer> observers = new ArrayList<>();
    private String status = "";

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public String getStatus(){
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

}
