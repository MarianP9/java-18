package week_7_object_containers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) {

        PersonTreeSet personTreeSet = new PersonTreeSet();

        Person mark = new Person("Mark", 19);
        Person angela = new Person("Angela", 23);
        Person zoey = new Person("Zoey", 20);

        personTreeSet.addPerson(angela);
        personTreeSet.addPerson(zoey);
        personTreeSet.addPerson(mark);
        personTreeSet.addPerson(new Person("Mark", 34));
        personTreeSet.addPerson(new Person("Hannah", 23));

        personTreeSet.printPersons();
        System.out.println();


        Hobby cycling = new Hobby("Cycling", 3);
        cycling.addAddress(new Address("Italy", "Rome", "Vittorio Emanuele"));
        cycling.addAddress(new Address("Australia", "Victoria", "The Great Ocean Road"));
        cycling.addAddress(new Address("France", "Burgundy", "Route des Grand Crus"));

        Hobby hiking = new Hobby("Hiking", 4);
        hiking.addAddress(new Address("United Kingdom", "Sendai", "The Basho Wayfarer"));
        hiking.addAddress(new Address("Argentina", "Bariloche", "Refugio Frey and Cerro Catedral"));

        Hobby snowboarding = new Hobby("Snowboarding", 2);
        snowboarding.addAddress(new Address("USA", "Colorado", "Telluride"));
        snowboarding.addAddress(new Address("Switzerland", "Valais", "Verbier"));


        List<Hobby> angelasHobbies = new LinkedList<>();
        angelasHobbies.add(cycling);
        angelasHobbies.add(snowboarding);

        List<Hobby> marksHobbies = new LinkedList<>();
        marksHobbies.add(snowboarding);
        marksHobbies.add(hiking);

        List<Hobby> zoeysHobbies = new LinkedList<>();
        zoeysHobbies.add(hiking);


        Map<Person, List<Hobby>> hobbyMap = new HashMap<>();

        hobbyMap.put(angela, angelasHobbies);
        hobbyMap.put(mark, marksHobbies);
        hobbyMap.put(zoey, zoeysHobbies);

        printHobbies(angela, hobbyMap.get(angela));
        printHobbies(mark, hobbyMap.get(mark));
        printHobbies(zoey, hobbyMap.get(zoey));
    }

    /**
     * Prints the person's name, it's hobbies and the countries where they can be practiced
     *
     * @param person    A person
     * @param hobbyList The person's hobbies list
     */
    static void printHobbies(Person person, List<Hobby> hobbyList) {
        System.out.println(person.getName() + "'s hobbies: ");
        for (Hobby hobby : hobbyList) {
            System.out.print(hobby.getName() + " countries: ");
            for (Address address : hobby.getAddressList()) {
                System.out.print(address.getCountry() + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
