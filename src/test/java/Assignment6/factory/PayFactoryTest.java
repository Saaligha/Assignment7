package Assignment6.factory;

import Assignment6.domain.Pay;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PayFactoryTest {
    private int p;

    @Before
    public void setUp() throws Exception {
        this.p = 4;
    }

    @Test
    public void buildPay(){

        Pay p = PayFactory.getPay(this.p);
        Assert.assertNotNull(p.getAmt());
    }

}
