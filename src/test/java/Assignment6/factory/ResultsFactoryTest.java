package Assignment6.factory;

import Assignment6.domain.Results.Results;
import Assignment6.factory.Results.ResultsFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ResultsFactoryTest {

    private int finalR;
    private int semR;
    private boolean p;

    @Before
    public void setUp() throws Exception {
        this.finalR = 45;
        this.p =  true;
        this.semR = 34;
    }

    @Test
    public void buildCourse(){
        Results r = ResultsFactory.getRes(this.finalR, this.semR, this.p);

        Assert.assertNotNull(r.getFinalResults());
        Assert.assertNotNull(r.getSemesterResults());
        Assert.assertNotNull(r.isPassOrFail());

    }

}