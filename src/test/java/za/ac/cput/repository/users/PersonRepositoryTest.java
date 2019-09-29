package za.ac.cput.repository.users;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Person;
import za.ac.cput.factory.users.PersonFactory;
import za.ac.cput.repository.users.impl.PersonRepositoryImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonRepositoryTest {

    @Autowired
    private PersonRepositoryImpl personRepository;
    Person person = PersonFactory.getPerson("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {

        personRepository.create(person);
        assertNotNull(personRepository.getAll());
        System.out.println(personRepository.getAll());

    }

    @Test
    public void b_read() {

        Person fromSet = personRepository.read(person.getUserID());
        assertEquals(person, fromSet);
        System.out.println(personRepository.getAll());
    }

    @Test
    public void c_update() {


        Person updatedPerson  = PersonFactory.getPerson("TestID", "TestName2", "TestLastName", "TestEmail");
        personRepository.update(updatedPerson);
        Assert.assertNotEquals(person.getFirstName(), updatedPerson.getFirstName());
        System.out.println(personRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(personRepository.getAll());
        personRepository.delete(person.getUserID());
        Person personTor = personRepository.read(person.getUserID());
        assertNull(personTor);
        System.out.println(personRepository.getAll());

    }
}