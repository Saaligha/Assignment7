package com.assignments.factory;

import com.assignments.domain.PremiumUser;
import org.junit.Assert;
import org.junit.Test;

public class PremiumUserFactoryTest {
    @Test
    public void getPremiumUser(){

        PremiumUser User = PremiumUserFactory.getPremiumUser("1234", "James", "May");
        Assert.assertNotNull(User);
    }
}
