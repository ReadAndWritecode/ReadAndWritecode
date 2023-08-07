package patterns.observer;


/**
 * Интерфейс для Subject(издатель)
 */
interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String message);
}