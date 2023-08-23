package patterns.bridge;


/**
 * Конкретная реализация способа отправки сообщения - через электронную почту
 */
public class EmailMessageSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}