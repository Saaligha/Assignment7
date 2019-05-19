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

    private LocationImp repo;
    private Set<Location> loc;

    Location l1,l2;

    @Before
    public void setUp() throws Exception {
        this.repo = LocationImp.getRepo();
    }
@Test
    public void create(){
        l1 = new Location.Builder().region("SA").build();
        l2 = new Location.Builder().region("JHB").build();

        Location l = this.repo.create(l1);

        Location ll = this.repo.create(l2);

        Assert.assertNotEquals(l1, l);
}

@Test
    public void update(){
        l1 = new Location.Builder().region("SA").build();
        Location l = this.repo.update(l1);

        Assert.assertEquals(l1, l);

}

@Test
    public void delete(){
        String s = "SA";
        this.repo.delete(s);
       // int size = loc.size();
        //Assert.assertNotEquals(0,size);
}
}