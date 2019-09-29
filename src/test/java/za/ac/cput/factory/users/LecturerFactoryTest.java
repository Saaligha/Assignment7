package za.ac.cput.factory.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.Lecturer;

public class LecturerFactoryTest {

    @Test
    public void getLecturer() {

        Lecturer lecturer = LecturerFactory.getLecturer( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(lecturer);
    }
}