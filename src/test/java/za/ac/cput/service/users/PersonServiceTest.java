package za.ac.cput.service.users;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Person;
import za.ac.cput.factory.users.PersonFactory;
import za.ac.cput.service.users.impl.PersonServiceImpl;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonServiceTest {

    @Autowired
    private PersonServiceImpl personService;
    Person person = PersonFactory.getPerson("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {


        personService.create(person);

        assertNotNull(personService.getAll());
        System.out.println(personService.getAll());
    }

    @Test
    public void b_read() {


        assertNotNull(personService.getAll());

        Person person1 = personService.read(person.getUserID());

        assertEquals(person, person1);
        System.out.println(personService.getAll());


    }

    @Test
    public void c_update() {



        assertNotNull(personService.getAll());

        Person person1 = PersonFactory.getPerson("TestID", "TestName2", "TestLastName", "TestEmail");
        person1.setUserID(person.getUserID());
        personService.update(person1);

        Person person2 = personService.read(person1.getUserID());

        assertEquals(person1, person2);
        System.out.println(personService.getAll());

    }

    @Test
    public void d_delete() {



        assertNotNull(personService.getAll());

        personService.delete(person.getUserID());

        Person notInSet = personService.read(person.getUserID());

        assertNull(notInSet);
        System.out.println(personService.getAll());





    }
}