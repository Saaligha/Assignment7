package za.ac.cput.repository.users;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.StudentSponsor;
import za.ac.cput.factory.users.StudentSponsorFactory;
import za.ac.cput.repository.users.impl.StudentSponsorRepositoryImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentSponsorRepositoryTest {

    @Autowired
    private StudentSponsorRepositoryImpl studentSponsorRepository;
    StudentSponsor studentSponsor = StudentSponsorFactory.getStudentSponsor("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {

        studentSponsorRepository.create(studentSponsor);
        assertNotNull(studentSponsorRepository.getAll());
        System.out.println(studentSponsorRepository.getAll());

    }

    @Test
    public void b_read() {

        StudentSponsor fromSet = studentSponsorRepository.read(studentSponsor.getUserID());
        assertEquals(studentSponsor, fromSet);
        System.out.println(studentSponsorRepository.getAll());
    }

    @Test
    public void c_update() {


        StudentSponsor updatedStudentSponsor  = StudentSponsorFactory.getStudentSponsor("TestID", "TestName2", "TestLastName", "TestEmail");
        studentSponsorRepository.update(updatedStudentSponsor);
        Assert.assertNotEquals(studentSponsor.getFirstName(), updatedStudentSponsor.getFirstName());
        System.out.println(studentSponsorRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(studentSponsorRepository.getAll());
        studentSponsorRepository.delete(studentSponsor.getUserID());
        StudentSponsor studentSponsorTor = studentSponsorRepository.read(studentSponsor.getUserID());
        assertNull(studentSponsorTor);
        System.out.println(studentSponsorRepository.getAll());

    }
}