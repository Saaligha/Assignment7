package Assignment6.factory;

import Assignment6.domain.HoursClocked;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HoursClockedFactoryTest {

    private int h;

    @Before
    public void setUp() throws Exception {
        this.h = 4;
    }

    @Test
    public void buildHours(){
        HoursClocked h = HoursClockedFactory.hours(this.h);
        Assert.assertNotNull(h.getHours());

    }
}
