package types;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p;

    @BeforeEach
    void setUp() {
        p = new Person("James", "11223344A");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getName() {

        assertNotNull(p.getName());
        assertEquals("James", p.getName());

    }

    @Test
    void setName() {
    }

    @Test
    void getIdCard() {
    }

    @Test
    void setIdCard() {
    }

    @Test
    void testEquals()
    {
        Person testPerson = new Person("Test2","1111112K");
        testPerson.setIdCard(p.getIdCard());
        assertTrue(p.equals(testPerson));
        testPerson.setIdCard("222222");
        assertFalse(p.equals(testPerson));
    }

}