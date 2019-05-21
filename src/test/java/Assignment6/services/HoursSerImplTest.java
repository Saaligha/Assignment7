package Assignment6.services;

import Assignment6.domain.HoursClocked;
import Assignment6.factory.HoursClockedFactory;
import Assignment6.factory.QuizFactory;
import Assignment6.repository.HoursClockedRepo;
import Assignment6.repository.implementation.HoursClockedImp;
import Assignment6.repository.implementation.QuizImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HoursSerImplTest {

    private HoursClockedRepo repository;
    private HoursClocked h;

@Before
    public void setUp() throws Exception{
    this.repository = HoursClockedImp.getRepository();
    this.h = HoursClockedFactory.hours(45);
}
    @Test
    public void create(){
        HoursClocked created = this.repository.create(this.h);
        System.out.println("Created Hours:" );
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.h);

    }

    @Test
    public void update(){
        HoursClocked created = this.repository.create(this.h);
        HoursClocked created2 = this.repository.create(this.h);
        HoursClocked created3 = this.repository.create(this.h);
        this.repository.create(created);
        this.repository.create(created2);

        HoursClocked updated = this.repository.update(created3);
        Assert.assertEquals(created3, updated);
        Assert.assertNotNull(created3);
        System.out.println("Updated" +updated);

    }

    @Test
    public void delete(){

        HoursClocked created = this.repository.create(this.h);
        HoursClocked created2 = this.repository.create(this.h);

        this.repository.create(created);
        this.repository.create(created2);

        this.repository.delete(String.valueOf(created.getHours()));

        int a = this.repository.getAll().size();
        Assert.assertNotNull(created);
        Assert.assertEquals(0, a);
        System.out.println("Deleted: " +a);
    }

    @Test
    public void read(){
        HoursClocked created = this.repository.create(this.h);
        this.repository.create(created);
        HoursClocked s = this.repository.read(String.valueOf(created.getHours()));

        // Assert.assertEquals(created, s);
        Assert.assertNotNull(s);
        System.out.println("Read: " +s);
    }
}
