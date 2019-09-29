package za.ac.cput.repository.users;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.User;

import za.ac.cput.factory.users.UserFactory;
import za.ac.cput.repository.users.impl.UserRepositoryImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRepositoryTest {

    @Autowired
    private UserRepositoryImpl hodRepository;
    User user = UserFactory.getUser("658", "Sally", "Lang", "Lang@pooiy.com");

    @Test
    public void a_create() {

        hodRepository.create(user);
        assertNotNull(hodRepository.getAll());
        System.out.println(hodRepository.getAll());

    }

    @Test
    public void b_read() {

        User fromSet = hodRepository.read(user.getUserID());
        assertEquals(user, fromSet);
        System.out.println(hodRepository.getAll());
    }

    @Test
    public void c_update() {


        User updatedUser = UserFactory.getUser("658", "Reley", "Lang", "Lang@pooiy.com");
        hodRepository.update(updatedUser);
        Assert.assertNotEquals(user.getFirstName(), updatedUser.getFirstName());
        System.out.println(hodRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(hodRepository.getAll());
        hodRepository.delete(user.getUserID());
        User userTor = hodRepository.read(user.getUserID());
        assertNull(userTor);
        System.out.println(hodRepository.getAll());

    }
}