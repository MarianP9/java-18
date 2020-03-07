package week_7_object_containers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTreeSetTest {

    PersonTreeSet personTreeSet;

    @BeforeEach
    void init() {
        personTreeSet = new PersonTreeSet();
    }

    @Test
    void add_null_person() {
        Person person = new Person("Mark", 32);

        personTreeSet.addPerson(person);
        personTreeSet.addPerson(null);

        PersonTreeSet expectedResult = new PersonTreeSet();
        expectedResult.addPerson(person);

        assertEquals(expectedResult, personTreeSet);
    }

    @Test
    void add_only_null_person() {
        personTreeSet.addPerson(null);
        personTreeSet.addPerson(null);

        assertEquals(new PersonTreeSet(), personTreeSet);
    }

    @Test
    void add_valid_person() {
        Person person = new Person("Mark", 32);

        personTreeSet.addPerson(person);

        PersonTreeSet expectedResult = new PersonTreeSet();
        expectedResult.addPerson(person);

        assertEquals(expectedResult, personTreeSet);
    }

    @Test
    void add_valid_persons() {
        Person person1 = new Person("Mark", 32);
        Person person2 = new Person("Martha", 28);

        personTreeSet.addPerson(person1);
        personTreeSet.addPerson(person2);

        PersonTreeSet expectedResult = new PersonTreeSet();
        expectedResult.addPerson(person1);
        expectedResult.addPerson(person2);

        assertEquals(expectedResult, personTreeSet);
    }
}