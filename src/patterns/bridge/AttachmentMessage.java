package patterns.bridge;


/**
 * Конкретная реализация абстракции - сообщение с вложением
 */
public class AttachmentMessage extends Message {
    private String text;
    private String attachment;

    public AttachmentMessage(String text, String attachment, MessageSender messageSender) {
        super(messageSender);
        this.text = text;
        this.attachment = attachment;
    }

    @Override
    public void send() {
        messageSender.sendMessage("Attachment Message: " + text + " with attachment: " + attachment);
    }
}