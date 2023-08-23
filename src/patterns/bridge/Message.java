package patterns.bridge;


/**
 * Абстракция для типа сообщения
 */
public abstract class Message {
    protected MessageSender messageSender;

    protected Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void send();
}