package Assignment6.repository.implementation;

import Assignment6.domain.DifficultyLevel;
import Assignment6.repository.DifficultyRepo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class DifficultyImpTest {

    private DifficultyRepo repository;
    private Set<DifficultyLevel> difficulty;

    DifficultyLevel d1, d2;
    @Before
    public void setUp() throws Exception{
        this.repository = DifficultyImp.getRepository();
    }

    @Test
    public void create()
    {
        d1 = new DifficultyLevel.Builder().level(5).build();
        d2 = new DifficultyLevel.Builder().level(6).build();
        DifficultyLevel d = this.repository.create(d1);

        DifficultyLevel dd = this.repository.create(d2);

        Assert.assertEquals(d1, d);
        Assert.assertEquals(d2, dd);
    }
    @Test
    public void read()
    {
        String s = "6";
        DifficultyLevel c1 = this.repository.read(s);

        Assert.assertNotEquals(s, c1.getLevel());
        System.out.println(c1);
    }
    @Test
    public void update()
    {
        d1 = new DifficultyLevel.Builder().level(5).build();
        DifficultyLevel dd = this.repository.update(d1);
        Assert.assertEquals(d1, dd);
        System.out.println(dd.getLevel());
    }

    @Test
    public void delete()
    {
        String s = "5";
        this.repository.delete(s);
        difficulty = this.repository.getAll();
        int size = difficulty.size();
        Assert.assertNotEquals(1, size);
    }
}