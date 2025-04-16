package site.hnfy258.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String state;

    @Override
    public void add(site.hnfy258.observerPattern.Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(site.hnfy258.observerPattern.Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String msg) {
        for(Observer observer : observers){
            observer.update(msg);
        }
    }

}
