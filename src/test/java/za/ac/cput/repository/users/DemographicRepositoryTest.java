package za.ac.cput.repository.users;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Demographic;
import za.ac.cput.factory.users.DemographicFactory;
import za.ac.cput.repository.users.impl.DemographicRepositoryImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DemographicRepositoryTest {

    @Autowired
    private DemographicRepositoryImpl venueRepository;
    Demographic demographic = DemographicFactory.getDemographic("895", "Indian", "Female", "");

    @Test
    public void a_create() {

        venueRepository.create(demographic);
        assertNotNull(venueRepository.getAll());
        System.out.println(venueRepository.getAll());

    }

    @Test
    public void b_read() {

        Demographic fromSet = venueRepository.read(demographic.getVenueID());
        assertEquals(demographic, fromSet);
        System.out.println(venueRepository.getAll());
    }

    @Test
    public void c_update() {


        Demographic updatedDemographic = DemographicFactory.getDemographic("456", "English", "Female", "");
        venueRepository.update(updatedDemographic);
        Assert.assertNotEquals(demographic.getVenueName(), updatedDemographic.getVenueName());
        System.out.println(venueRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(venueRepository.getAll());
        venueRepository.delete(demographic.getVenueID());
        Demographic demographicTor = venueRepository.read(demographic.getVenueID());
        assertNull(demographicTor);
        System.out.println(venueRepository.getAll());

    }
}