package za.ac.cput.service.users;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.StudentSponsor;
import za.ac.cput.factory.users.StudentSponsorFactory;
import za.ac.cput.service.users.impl.StudentSponsorServiceImpl;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentSponsorServiceTest {

    @Autowired
    private StudentSponsorServiceImpl studentSponsorService;
    StudentSponsor studentSponsor = StudentSponsorFactory.getStudentSponsor("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {


        studentSponsorService.create(studentSponsor);

        assertNotNull(studentSponsorService.getAll());
        System.out.println(studentSponsorService.getAll());
    }

    @Test
    public void b_read() {


        assertNotNull(studentSponsorService.getAll());

        StudentSponsor studentSponsor1 = studentSponsorService.read(studentSponsor.getUserID());

        assertEquals(studentSponsor, studentSponsor1);
        System.out.println(studentSponsorService.getAll());


    }

    @Test
    public void c_update() {



        assertNotNull(studentSponsorService.getAll());

        StudentSponsor studentSponsor1 = StudentSponsorFactory.getStudentSponsor("TestID", "TestName2", "TestLastName", "TestEmail");
        studentSponsor1.setUserID(studentSponsor.getUserID());
        studentSponsorService.update(studentSponsor1);

        StudentSponsor studentSponsor2 = studentSponsorService.read(studentSponsor1.getUserID());

        assertEquals(studentSponsor1, studentSponsor2);
        System.out.println(studentSponsorService.getAll());

    }

    @Test
    public void d_delete() {



        assertNotNull(studentSponsorService.getAll());

        studentSponsorService.delete(studentSponsor.getUserID());

        StudentSponsor notInSet = studentSponsorService.read(studentSponsor.getUserID());

        assertNull(notInSet);
        System.out.println(studentSponsorService.getAll());





    }
}