package patterns.bridge;


/**
 * Интерфейс для способа отправки сообщения
 */
public interface MessageSender {
    void sendMessage(String message);
}