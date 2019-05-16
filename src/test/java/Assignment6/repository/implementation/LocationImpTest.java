package Assignment6.repository.implementation;

import Assignment6.domain.Course;
import Assignment6.domain.Location;
import Assignment6.domain.Location;
import Assignment6.domain.Location;
import Assignment6.factory.CourseFactory;
import Assignment6.factory.LocationFactory;
import Assignment6.repository.LocationRepo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static com.sun.deploy.config.JREInfo.getAll;
import static org.junit.Assert.*;

public class LocationImpTest {

 private LocationRepo repository;
 private Location loc;

    private Location savedLocation() {
        Set<Location> savedLocation = this.repository.getAll();
        return savedLocation.iterator().next();
    }



    @Before
    public void setUp() throws Exception {
        this.repository = LocationImp.getRepo();
        this.loc = LocationFactory.UserRegion("Asia");
    }

    @Test
    public void a_create() {
        Location created = this.repository.create(this.loc);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.loc);
    }

    @Test
    public void b_read() {
        Location savedLocation = savedLocation();
        System.out.println("In read, region = "+ savedLocation.getRegion());
        Location read = this.repository.read(savedLocation.getRegion());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedLocation, read);
    }

    @Test
    public void e_delete() {
        Location savedLocation = savedLocation();
        this.repository.delete(savedLocation().getRegion());
        getAll();
    }
    @Test
    public void c_update() {
        String region = "New Region";
        Location loc = new Location.Builder().copy(savedLocation()).region().build();
        System.out.println("In update, about_to_updated = " + loc);
        Location updated = this.repository.update(loc);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(region, updated.getRegion());
        getAll();
    }
    @Test
    public void d_getAll() {
        Set<Location> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }
}