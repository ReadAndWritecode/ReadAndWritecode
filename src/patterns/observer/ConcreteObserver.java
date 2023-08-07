package patterns.observer;

/**
 * Concrete Observer implementation class
 */
class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println(name + " received message: " + message);
    }
}