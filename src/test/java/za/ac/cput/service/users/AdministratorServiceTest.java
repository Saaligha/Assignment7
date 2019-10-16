package za.ac.cput.service.users;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Administrator;
import za.ac.cput.factory.users.AdministratorFactory;
import za.ac.cput.service.users.impl.AdministratorServiceImpl;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AdministratorServiceTest {

    @Autowired
    private AdministratorServiceImpl administratorService;
    Administrator administrator = AdministratorFactory.getAdministrator("Admin123", "Admin", "Admin", "Admin@gmail.cool");

    @Test
    public void a_create() {


        administratorService.create(administrator);

        assertNotNull(administratorService.getAll());
        System.out.println(administratorService.getAll());
    }

    @Test
    public void b_read() {


        assertNotNull(administratorService.getAll());

        Administrator administrator1 = administratorService.read(administrator.getUserID());

        assertEquals(administrator, administrator1);
        System.out.println(administratorService.getAll());


    }

    @Test
    public void c_update() {



        assertNotNull(administratorService.getAll());

        Administrator administrator1 = AdministratorFactory.getAdministrator("Admin123", "Admin", "Admin", "Admin@gmail.cool");
        administrator1.setUserID(administrator.getUserID());
        administratorService.update(administrator1);

        Administrator administrator2 = administratorService.read(administrator1.getUserID());

        assertEquals(administrator1, administrator2);
        System.out.println(administratorService.getAll());

    }

    @Test
    public void d_delete() {



        assertNotNull(administratorService.getAll());

        administratorService.delete(administrator.getUserID());

        Administrator notInSet = administratorService.read(administrator.getUserID());

        assertNull(notInSet);
        System.out.println(administratorService.getAll());





    }
}