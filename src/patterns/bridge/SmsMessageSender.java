package patterns.bridge;


/**
 * Конкретная реализация способа отправки сообщения - через SMS
 */
public class SmsMessageSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}