package za.ac.cput.factory.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.User;

public class UserFactoryTest {

    @Test
    public void getHOD() {

        User user = UserFactory.getUser( "125", "Adam", "Sand", "Sands@kgloj.com");
        Assert.assertNotNull(user);
    }
}