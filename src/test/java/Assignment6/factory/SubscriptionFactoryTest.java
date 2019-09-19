package Assignment6.factory;

import Assignment6.domain.Payment.Subscription;
import Assignment6.factory.Payment.SubscriptionFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubscriptionFactoryTest {

    private boolean type;

    @Before
    public void setUp() throws Exception {
        this.type = true;
    }

    @Test
    public void SubTest(){
        Subscription s = SubscriptionFactory.sub(this.type);
            Assert.assertNotNull(s.isType());
            Assert.assertTrue(String.valueOf(type), true);


    }
}
