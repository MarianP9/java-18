package week_5_oop_ii;

class Main {
    public static void main(String[] args) {
        //Phone phone = new Samsung(); // shouldn't compile
        Phone phone = new SamsungGalaxyS6("black", "aluminum", 989529206081393L);

        phone.addContact(1, "561-731-3013", "Albert", "Stevens");
        phone.addContact(2, "919-261-6537", "Theodore", "Reuter");
        phone.addContact(3, "631-360-0152", "David", "Smith");
        phone.listContacts();

        phone.sendMessage("561-731-3013", "Foo");
        phone.sendMessage("919-261-6537", "Bar");
        phone.sendMessage("561-731-3013", "Baz");
        phone.listMessages("561-731-3013");

        phone.call("919-261-6537");
        phone.call("561-731-3013");
        phone.call("631-360-0152");
        phone.viewHistory();
    }
}
