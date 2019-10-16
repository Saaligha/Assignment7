package za.ac.cput.service.users;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Demographic;
import za.ac.cput.factory.users.DemographicFactory;
import za.ac.cput.service.users.impl.DemographicServiceImpl;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DemographicServiceTest {

    @Autowired
    private DemographicServiceImpl venueService;
    Demographic demographic = DemographicFactory.getDemographic("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {


        venueService.create(demographic);

        assertNotNull(venueService.getAll());
        System.out.println(venueService.getAll());
    }

    @Test
    public void b_read() {


        assertNotNull(venueService.getAll());

        Demographic demographic1 = venueService.read(demographic.getVenueID());

        assertEquals(demographic, demographic1);
        System.out.println(venueService.getAll());


    }

    @Test
    public void c_update() {



        assertNotNull(venueService.getAll());

        Demographic demographic1 = DemographicFactory.getDemographic("TestID", "TestName2", "TestLastName", "TestEmail");
        demographic1.setVenueID(demographic.getVenueID());
        venueService.update(demographic1);

        Demographic demographic2 = venueService.read(demographic1.getVenueID());

        assertEquals(demographic1, demographic2);
        System.out.println(venueService.getAll());

    }

    @Test
    public void d_delete() {



        assertNotNull(venueService.getAll());

        venueService.delete(demographic.getVenueID());

        Demographic notInSet = venueService.read(demographic.getVenueID());

        assertNull(notInSet);
        System.out.println(venueService.getAll());





    }
}