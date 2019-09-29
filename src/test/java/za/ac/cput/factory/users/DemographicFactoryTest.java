package za.ac.cput.factory.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.Demographic;

public class DemographicFactoryTest {

    @Test
    public void getVenue() {

        Demographic demographic = DemographicFactory.getDemographic( "789", "Indian", "Female", "");
        Assert.assertNotNull(demographic);
    }
}