package patterns.bridge;


/**
 * Конкретная реализация абстракции - обычное текстовое сообщение
 */
public class TextMessage extends Message {
    private String text;

    public TextMessage(String text, MessageSender messageSender) {
        super(messageSender);
        this.text = text;
    }

    @Override
    public void send() {
        messageSender.sendMessage("Text Message: " + text);
    }
}