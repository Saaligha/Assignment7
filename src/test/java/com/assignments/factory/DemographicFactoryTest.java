package com.assignments.factory;

import com.assignments.domain.Demographic;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DemographicFactoryTest {

    @Test
    public void getDemo() {
        Demographic demo = DemographicFactory.getDemo("I", "F");
        Assert.assertNotNull(demo);
    }
}