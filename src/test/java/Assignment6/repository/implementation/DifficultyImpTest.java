package Assignment6.repository.implementation;

import Assignment6.domain.Progress.DifficultyLevel;
import Assignment6.factory.Progress.DifficultyLevelFactory;
import Assignment6.repository.Progress.Impl.DifficultyImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DifficultyImpTest {
    private DifficultyImp repository;
    private DifficultyLevel level;

    @Before
    public void setUp() throws Exception{
        this.repository = DifficultyImp.getRepository();
        this.level = DifficultyLevelFactory.levelFectory(65);
    }
    @Test
    public void create(){
        DifficultyLevel created = this.repository.create(this.level);
        System.out.println("Created: Difficulty Level:" );
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.level);

    }
    @Test
    public void update(){
        DifficultyLevel created = this.repository.create(this.level);
        DifficultyLevel created2 = this.repository.create(this.level);
        DifficultyLevel created3 = this.repository.create(this.level);
        this.repository.create(created);
        this.repository.create(created2);

        DifficultyLevel updated = this.repository.update(created3);
        Assert.assertEquals(created3, updated);
        Assert.assertNotNull(created3);
        System.out.println("Updated" +updated);

    }

    @Test
    public void delete(){

        DifficultyLevel created = this.repository.create(this.level);
        DifficultyLevel created2 = this.repository.create(this.level);

        this.repository.create(created);
        this.repository.create(created2);

        this.repository.delete(String.valueOf(created.getLevel()));

        int a = this.repository.getAll().size();
        Assert.assertNotNull(created);
        Assert.assertEquals(1, a);
        System.out.println("Deleted: " +a);
    }
    @Test
    public void read(){
        DifficultyLevel created = this.repository.create(this.level);
        this.repository.create(created);
        DifficultyLevel s = this.repository.read(String.valueOf(created.getLevel()));

        // Assert.assertEquals(created, s);
        Assert.assertNull(s);

        System.out.println("Read: " +s);
    }
}