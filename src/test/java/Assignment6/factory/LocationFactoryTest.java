package Assignment6.factory;

import Assignment6.domain.Location;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LocationFactoryTest {

    private String r;

    @Before
    public void setUp() throws Exception {
        this.r = "SA";
    }

    @Test
    public void buildLocation(){
        Location r = LocationFactory.UserRegion(this.r);
        Assert.assertNull(r.getRegion());
    }
}
