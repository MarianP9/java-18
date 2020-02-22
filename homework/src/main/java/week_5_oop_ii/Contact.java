package week_5_oop_ii;

class Contact {
    private int id;
    private String number;
    private String firstName;
    private String lastName;

    Contact(int id, String number, String firstName, String lastName) {
        this.id = id;
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    int getId() {
        return id;
    }

    String getNumber() {
        return number;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Number: " + number + ", Name: " + firstName + " " + lastName;
    }
}
