package patterns.observer;


/**
 * Интерфейс для Observer(Наблюдатель)
 */
interface Observer {
    void sendNotification(String message);
}