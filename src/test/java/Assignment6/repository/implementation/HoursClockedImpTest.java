package Assignment6.repository.implementation;

import Assignment6.domain.HoursClocked;
import Assignment6.repository.HoursClockedRepo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Set;

import static org.junit.Assert.*;

public class HoursClockedImpTest {

    private HoursClockedRepo repository;
    private Set<HoursClocked> hours;

    HoursClocked h1, h2;
    @Before
    public void setUp() throws Exception{
        this.repository = HoursClockedImp.getRepository();
    }

    @Test
    public void create() {
        h1 = new HoursClocked.Builder().hours(5).build();
        h2 = new HoursClocked.Builder().hours(5).build();
        HoursClocked h = this.repository.create(h1);

        HoursClocked hh = this.repository.create(h2);
    }

    @Test
    public void update() {
        h1 = new HoursClocked.Builder().hours(9).build();
        HoursClocked hh = this.repository.update(h1);
        Assert.assertEquals(h1, hh);
        System.out.println(hh.getHours());
    }



    @Test
    public void read() {
    }
}