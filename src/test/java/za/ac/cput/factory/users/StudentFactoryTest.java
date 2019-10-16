package za.ac.cput.factory.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.Student;

public class StudentFactoryTest {

    @Test
    public void getStudent() {

        Student student = StudentFactory.getStudent( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(student);
    }
}