package week_7_object_containers;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class PersonTreeSet {

    private Set<Person> personTreeSet = new TreeSet<>(new Comparator<Person>() {
        @Override
        public int compare(Person person, Person t1) {
            int nameComparison = person.getName().compareTo(t1.getName());
            if (nameComparison != 0)
                return nameComparison;
            else {
                Integer age1 = person.getAge();
                Integer age2 = t1.getAge();
                return age1.compareTo(age2);
            }
        }
    });


    /**
     * Adds a non-null person to the set
     *
     * @param person
     * @return True if successfully added to the set, false otherwise
     */
    boolean addPerson(Person person) {
        if (person != null)
            return personTreeSet.add(person);
        else
            return false;
    }

    /**
     * Prints all the persons in the set
     */
    void printPersons() {
        for (Person person : personTreeSet) {
            System.out.println(person);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonTreeSet that = (PersonTreeSet) o;
        return Objects.equals(personTreeSet, that.personTreeSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personTreeSet);
    }
}
