package za.ac.cput.repository.users;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Administrator;
import za.ac.cput.factory.users.AdministratorFactory;
import za.ac.cput.repository.users.impl.AdministratorRepositoryImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AdministratorRepositoryTest {

    @Autowired
    private AdministratorRepositoryImpl administratorRepository;
    Administrator administrator = AdministratorFactory.getAdministrator("125", "Admin", "Admin", "admin@kjfh.com");

    @Test
    public void a_create() {

        administratorRepository.create(administrator);
        assertNotNull(administratorRepository.getAll());
        System.out.println(administratorRepository.getAll());

    }

    @Test
    public void b_read() {

        Administrator fromSet = administratorRepository.read(administrator.getUserID());
        assertEquals(administrator, fromSet);
        System.out.println(administratorRepository.getAll());
    }

    @Test
    public void c_update() {


        Administrator updatedAdministrator  = AdministratorFactory.getAdministrator("125", "AdminUpdated", "Admin", "admin@kjfh.com");
        administratorRepository.update(updatedAdministrator);
        Assert.assertNotEquals(administrator.getFirstName(), updatedAdministrator.getFirstName());
        System.out.println(administratorRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(administratorRepository.getAll());
        administratorRepository.delete(administrator.getUserID());
        Administrator administratorTor = administratorRepository.read(administrator.getUserID());
        assertNull(administratorTor);
        System.out.println(administratorRepository.getAll());

    }
}