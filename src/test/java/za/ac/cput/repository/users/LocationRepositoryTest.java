package za.ac.cput.repository.users;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Location;
import za.ac.cput.factory.users.LocationFactory;
import za.ac.cput.service.users.SubjectService;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LocationRepositoryTest {

    @Autowired
    private SubjectService.LocationRepositoryImpl universityRepository;
    Location location = LocationFactory.getLoc("4", "Cape Town", "Western Cape", "S.A");

    @Test
    public void a_create() {

        universityRepository.create(location);
        assertNotNull(universityRepository.getAll());
        System.out.println(universityRepository.getAll());

    }

    @Test
    public void b_read() {

        Location fromSet = universityRepository.read(location.getUniversityID());
        assertEquals(location, fromSet);
        System.out.println(universityRepository.getAll());
    }

    @Test
    public void c_update() {


        Location updatedLocation = LocationFactory.getLoc("TestID", "TestName2", "TestLastName", "TestEmail");
        universityRepository.update(updatedLocation);
        Assert.assertNotEquals(location.getUniversityName(), updatedLocation.getUniversityName());
        System.out.println(universityRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(universityRepository.getAll());
        universityRepository.delete(location.getUniversityID());
        Location locationTor = universityRepository.read(location.getUniversityID());
        assertNull(locationTor);
        System.out.println(universityRepository.getAll());

    }
}