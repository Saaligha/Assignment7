package Assignment6.factory;

import Assignment6.domain.Progress.DifficultyLevel;
import Assignment6.factory.Progress.DifficultyLevelFactory;
import org.junit.Assert;
import org.junit.Before;

public class DifficultyLevelTest {
    private int l;

    @Before
    public void setUp() throws Exception {
    this.l = 1;
    }

    public void buildLevel(){
        DifficultyLevel level = DifficultyLevelFactory.levelFectory(this.l);
        Assert.assertEquals(1,1);
        Assert.assertNotNull(level.getLevel());

    }
}