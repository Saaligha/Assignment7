package Assignment6.factory;

import Assignment6.domain.Course;
import Assignment6.domain.Demographic;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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