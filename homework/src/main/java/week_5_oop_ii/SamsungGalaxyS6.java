package week_5_oop_ii;

class SamsungGalaxyS6 extends Samsung {
    String color;
    String material;
    long imei;

    Contact[] contactList;
    Message[] messageList;
    String[] callHistory;

    SamsungGalaxyS6(String color, String material, long imei) {
        this.color = color;
        this.material = material;
        this.imei = imei;
    }

    /**
     * Adds a contact to the contact list
     *
     * @param id          A unique id
     * @param phoneNumber The contact's phone number
     * @param firstName   The contact's first name
     * @param lastName    The contact's last name
     */
    @Override
    public void addContact(int id, String phoneNumber, String firstName, String lastName) {
        if (contactList == null) {
            contactList = new Contact[1];
            contactList[0] = new Contact(id, phoneNumber, firstName, lastName);
        } else {
            int newLength = contactList.length + 1;
            Contact[] newArray = new Contact[newLength];
            System.arraycopy(contactList, 0, newArray, 0, newLength - 1);
            newArray[newLength - 1] = new Contact(id, phoneNumber, firstName, lastName);
            contactList = newArray;
        }
    }

    /**
     * Prints all contacts from the contacts list
     */
    @Override
    public void listContacts() {
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    /**
     * Sends a message to a phone number
     *
     * @param phoneNumber The recipient's phone number
     * @param message     The message to be sent
     */
    @Override
    public void sendMessage(String phoneNumber, String message) {
        if (message.length() <= 500 && getBatteryLife() > 0) {
            if (messageList == null) {
                messageList = new Message[1];
                messageList[0] = new Message(phoneNumber, message);
            } else {
                int newLength = messageList.length + 1;
                Message[] newArray = new Message[newLength];
                System.arraycopy(messageList, 0, newArray, 0, newLength - 1);
                newArray[newLength - 1] = new Message(phoneNumber, message);
                messageList = newArray;
            }
            lowerBatteryLife(1);
        }
    }

    /**
     * Prints all messages sent to a specific phone number
     *
     * @param phoneNumber The phone number to look up
     */
    @Override
    public void listMessages(String phoneNumber) {
        for (Message message : messageList) {
            if (message.getRecipientNumber().equals(phoneNumber))
                System.out.println(message);
        }
    }


    /**
     * Makes a call to a specific phone number and stores it in call history
     *
     * @param phoneNumber The phone number to be called
     */
    @Override
    public void call(String phoneNumber) {
        if (getBatteryLife() > 0) {
            if (callHistory == null) {
                callHistory = new String[1];
                callHistory[0] = phoneNumber;
            } else {
                int newLength = callHistory.length + 1;
                String[] newArray = new String[newLength];
                System.arraycopy(callHistory, 0, newArray, 0, newLength - 1);
                newArray[newLength - 1] = phoneNumber;
                callHistory = newArray;
            }
            lowerBatteryLife(2);
        }
    }


    /**
     * Prints the call history
     */
    @Override
    public void viewHistory() {
        for (String phoneNumber : callHistory) {
            System.out.println("Call: " + phoneNumber);
        }
    }
}
