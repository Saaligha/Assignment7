package za.ac.cput.service.users;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.User;

import za.ac.cput.factory.users.UserFactory;
import za.ac.cput.service.users.impl.UserServiceImpl;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserServiceTest {

    @Autowired
    private UserServiceImpl hodService;
    User user = UserFactory.getUser("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {


        hodService.create(user);

        assertNotNull(hodService.getAll());
        System.out.println(hodService.getAll());
    }

    @Test
    public void b_read() {


        assertNotNull(hodService.getAll());

        User user1 = hodService.read(user.getUserID());

        assertEquals(user, user1);
        System.out.println(hodService.getAll());


    }

    @Test
    public void c_update() {



        assertNotNull(hodService.getAll());

        User user1 = UserFactory.getUser("TestID", "TestName2", "TestLastName", "TestEmail");
        user1.setUserID(user.getUserID());
        hodService.update(user1);

        User user2 = hodService.read(user1.getUserID());

        assertEquals(user1, user2);
        System.out.println(hodService.getAll());

    }

    @Test
    public void d_delete() {



        assertNotNull(hodService.getAll());

        hodService.delete(user.getUserID());

        User notInSet = hodService.read(user.getUserID());

        assertNull(notInSet);
        System.out.println(hodService.getAll());





    }
}