package za.ac.cput.service.users;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Student;
import za.ac.cput.factory.users.StudentFactory;
import za.ac.cput.service.users.impl.StudentServiceImpl;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentServiceTest {

    @Autowired
    private StudentServiceImpl studentService;
    Student student = StudentFactory.getStudent("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {


        studentService.create(student);

        assertNotNull(studentService.getAll());
        System.out.println(studentService.getAll());
    }

    @Test
    public void b_read() {


        assertNotNull(studentService.getAll());

        Student student1 = studentService.read(student.getUserID());

        assertEquals(student, student1);
        System.out.println(studentService.getAll());


    }

    @Test
    public void c_update() {



        assertNotNull(studentService.getAll());

        Student student1 = StudentFactory.getStudent("TestID", "TestName2", "TestLastName", "TestEmail");
        student1.setUserID(student.getUserID());
        studentService.update(student1);

        Student student2 = studentService.read(student1.getUserID());

        assertEquals(student1, student2);
        System.out.println(studentService.getAll());

    }

    @Test
    public void d_delete() {



        assertNotNull(studentService.getAll());

        studentService.delete(student.getUserID());

        Student notInSet = studentService.read(student.getUserID());

        assertNull(notInSet);
        System.out.println(studentService.getAll());





    }
}