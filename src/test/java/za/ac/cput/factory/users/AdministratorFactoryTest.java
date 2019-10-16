package za.ac.cput.factory.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.Administrator;

public class AdministratorFactoryTest {

    @Test
    public void getAdministrator() {

        Administrator administrator = AdministratorFactory.getAdministrator( "123", "Saaligha", "Logday", "slogday@gmail.com");
        Assert.assertNotNull(administrator);
    }
}