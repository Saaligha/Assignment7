package za.ac.cput.service.users;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Location;
import za.ac.cput.factory.users.LocationFactory;
import za.ac.cput.service.users.impl.LocationServiceImpl;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LocationServiceTest {

    @Autowired
    private LocationServiceImpl universityService;
    Location location = LocationFactory.getLoc("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {


        universityService.create(location);

        assertNotNull(universityService.getAll());
        System.out.println(universityService.getAll());
    }

    @Test
    public void b_read() {


        assertNotNull(universityService.getAll());

        Location location1 = universityService.read(location.getUniversityID());

        assertEquals(location, location1);
        System.out.println(universityService.getAll());


    }

    @Test
    public void c_update() {



        assertNotNull(universityService.getAll());

        Location location1 = LocationFactory.getLoc("TestID", "TestName2", "TestLastName", "TestEmail");
        location1.setUniversityID(location.getUniversityID());
        universityService.update(location1);

        Location location2 = universityService.read(location1.getUniversityID());

        assertEquals(location1, location2);
        System.out.println(universityService.getAll());

    }

    @Test
    public void d_delete() {



        assertNotNull(universityService.getAll());

        universityService.delete(location.getUniversityID());

        Location notInSet = universityService.read(location.getUniversityID());

        assertNull(notInSet);
        System.out.println(universityService.getAll());





    }
}