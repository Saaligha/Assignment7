package za.ac.cput.service.users;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Subject;
import za.ac.cput.factory.users.SubjectFactory;
import za.ac.cput.service.users.impl.SubjectServiceImpl;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SubjectServiceTest {

    @Autowired
    private SubjectServiceImpl subjectService;
    Subject subject = SubjectFactory.getSubject("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {


        subjectService.create(subject);

        assertNotNull(subjectService.getAll());
        System.out.println(subjectService.getAll());
    }

    @Test
    public void b_read() {


        assertNotNull(subjectService.getAll());

        Subject subject1 = subjectService.read(subject.getSubjectID());

        assertEquals(subject, subject1);
        System.out.println(subjectService.getAll());


    }

    @Test
    public void c_update() {



        assertNotNull(subjectService.getAll());

        Subject subject1 = SubjectFactory.getSubject("TestID", "TestName2", "TestLastName", "TestEmail");
        subject1.setSubjectID(subject.getSubjectID());
        subjectService.update(subject1);

        Subject subject2 = subjectService.read(subject1.getSubjectID());

        assertEquals(subject1, subject2);
        System.out.println(subjectService.getAll());

    }

    @Test
    public void d_delete() {



        assertNotNull(subjectService.getAll());

        subjectService.delete(subject.getSubjectID());

        Subject notInSet = subjectService.read(subject.getSubjectID());

        assertNull(notInSet);
        System.out.println(subjectService.getAll());





    }
}