package se.ecutb.erik;

import org.junit.Test;

import java.time.LocalDate;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class ProgrammerTest {

    @Test
    public void test_Object_created_successfully(){
        String name = "Test";
        LocalDate birthDate = LocalDate.parse("2001-01-27");

        Programmer testObject = new Programmer(name, birthDate);

        assertNotNull(testObject.getId());
        assertEquals("Test", testObject.getName());
        assertEquals(LocalDate.parse("2001-01-27"), testObject.getBirthDate());
        assertNotNull(testObject.getCertificates());
        assertNotNull(testObject.getSkills());

    }

}
