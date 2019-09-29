package za.ac.cput.factory.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.Subject;

public class SubjectFactoryTest {

    @Test
    public void getSubject() {

        Subject subject = SubjectFactory.getSubject( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(subject);
    }
}