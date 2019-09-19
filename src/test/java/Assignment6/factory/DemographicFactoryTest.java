package Assignment6.factory;

import Assignment6.domain.Demographic.Demographic;
import Assignment6.factory.Demographic.DemographicFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DemographicFactoryTest {
    private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "testName";
    }
    @Test
    public void buildDemographic(){
        Demographic d = DemographicFactory.demo(this.testName);
        Assert.assertNotNull(d.getGender());
        Assert.assertNotNull(d.getRace());

    }
}