package za.ac.cput.factory.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.Person;

public class PersonFactoryTest {

    @Test
    public void getPerson() {

        Person person = PersonFactory.getPerson( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(person);
    }
}