package week_5_oop_ii;

public class Message {
    private String recipientNumber;
    private String message;

    public Message(String recipientNumber, String message) {
        this.recipientNumber = recipientNumber;
        this.message = message;
    }

    public String getRecipientNumber() {
        return recipientNumber;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Message: \"" + message + "\", recipient: " + recipientNumber;
    }
}
