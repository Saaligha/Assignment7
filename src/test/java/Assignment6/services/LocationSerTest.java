package Assignment6.services;

import Assignment6.domain.Location;
import Assignment6.factory.LocationFactory;
import Assignment6.repository.implementation.LocationImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mockito.internal.debugging.LocationImpl;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LocationSerTest {
    private LocationImp repository;
    private Location loc;

    @Before
    public void setUp() throws Exception{
       this.repository = LocationImp.getRepo();
       this.loc = LocationFactory.UserRegion("SA");

    }

    @Test
    public void create(){
        Location created = this.repository.create(this.loc);
        System.out.println("Created: Location" );
        Assert.assertNotNull(created);
        // Assert.assertSame(created, this.course);

    }
    @Test
    public void update(){
        Location created = this.repository.create(this.loc);
        Location created2 = this.repository.create(this.loc);
        Location created3 = this.repository.create(this.loc);
        this.repository.create(created);
        this.repository.create(created2);

        Location updated = this.repository.update(created3);
        Assert.assertEquals(created3, updated);
        Assert.assertNotNull(created3);
        System.out.println("Updated" +updated);

    }
    @Test
    public void delete(){

        Location created = this.repository.create(this.loc);
        Location created2 = this.repository.create(this.loc);

        this.repository.create(created);
        this.repository.create(created2);

        this.repository.delete(created.getRegion());

        int a = this.repository.getAll().size();
        Assert.assertNotNull(created);
        Assert.assertEquals(0, a);
        System.out.println("Deleted" +a);
    }
    @Test
    public void read(){
        Location created = this.repository.create(this.loc);
        this.repository.create(created);
        Location s = this.repository.read(created.getRegion());

        Assert.assertEquals(created, s);
        Assert.assertNotNull(s);
        System.out.println("Read: " +s);
    }

}
