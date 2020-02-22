package week_5_oop_ii;

class Message {
    private String recipientNumber;
    private String message;

    Message(String recipientNumber, String message) {
        this.recipientNumber = recipientNumber;
        this.message = message;
    }

    String getRecipientNumber() {
        return recipientNumber;
    }

    String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Message: \"" + message + "\", recipient: " + recipientNumber;
    }
}
