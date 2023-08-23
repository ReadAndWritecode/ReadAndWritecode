package patterns.bridge;

// Использование
public class Main {

    public static void main(String[] args) {

        MessageSender emailSender = new EmailMessageSender();
        MessageSender smsSender = new SmsMessageSender();

        Message textEmailMessage = new TextMessage("Hello, this is a text email message.", emailSender);
        Message attachmentSmsMessage = new AttachmentMessage("Important document", "file.pdf", smsSender);

        textEmailMessage.send();
        attachmentSmsMessage.send();
    }
}