package patterns.observer;

/**
 * Demo class for pattern Observer
 */
public class ObserverDemo {

    public static void main(String[] args) {
        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");

        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyObservers("Hello, observers!");
    }
}