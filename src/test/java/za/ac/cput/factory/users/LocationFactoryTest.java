package za.ac.cput.factory.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.Location;

public class LocationFactoryTest {

    @Test
    public void getUniversity() {

        Location location = LocationFactory.getLoc( "654", "Cape Town", "Western Cape", "S.A");
        Assert.assertNotNull(location);
    }
}