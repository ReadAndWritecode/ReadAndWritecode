package patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Subject implementation class
 */
class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.sendNotification(message);
        }
    }
}