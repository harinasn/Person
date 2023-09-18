import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testGetIDNum() {
        Person person = new Person("00000A", "Hari", "Narayaan", "abc.", 2004);
        assertEquals("00000A", person.getIDnum());
    }

    @Test
    public void testGetFirstName() {
        Person person = new Person("00000A", "Hari", "Narayaan", "abc.", 2004);
        assertEquals("Hari", person.getFirstName());
    }

    @Test
    public void testGetLastName() {
        Person person = new  Person("00000A", "Hari", "Narayaan", "abc.", 2004);
        assertEquals("Narayaan", person.getLastName());
    }

    @Test
    public void testGetTitle() {
        Person person = new Person("00000A", "Hari", "Narayaan", "abc.", 2004);
        assertEquals("abc.", person.getTitle());
    }

    @Test
    public void testGetYOB() {
        Person person = new Person("00000A", "Hari", "Narayaan", "abc.", 2004);
        assertEquals(2004, person.getYOB());
    }

    @Test
    public void testFullName() {
        Person person = new Person("00000A", "Hari", "Narayaan", "abc.", 2004);
        assertEquals("Hari Narayaan", person.fullName());
    }

    @Test
    public void testFormalName() {
        Person person = new Person("00000A", "Hari", "Narayaan", "abc.", 2004);
        assertEquals("abc. Hari Narayaan", person.formalName());
    }

    @Test
    public void testGetAge() {
        // Assuming the current year is 2023
        Person person = new Person("00000A", "Hari", "Narayaan", "abc.", 2004);
        assertEquals("19", person.getAge());
    }

    @Test
    public void testGetAgeWithYear() {
        Person person = new Person("00000A", "Hari", "Narayaan", "abc.", 2004);
        assertEquals("25", person.getAge(2029));
    }

    @Test
    public void testToCSVDataRecord() {
        Person person = new Person("00000A", "Hari", "Narayaan", "abc.", 2004);
        assertEquals("00000A, Hari, Narayaan, abc., 2004", person.toCSVDataRecord());
    }
}
