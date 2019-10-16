package za.ac.cput.repository.users;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Student;
import za.ac.cput.factory.users.StudentFactory;
import za.ac.cput.repository.users.impl.StudentRepositoryImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentRepositoryTest {

    @Autowired
    private StudentRepositoryImpl studentRepository;
    Student student = StudentFactory.getStudent("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {

        studentRepository.create(student);
        assertNotNull(studentRepository.getAll());
        System.out.println(studentRepository.getAll());

    }

    @Test
    public void b_read() {

        Student fromSet = studentRepository.read(student.getUserID());
        assertEquals(student, fromSet);
        System.out.println(studentRepository.getAll());
    }

    @Test
    public void c_update() {


        Student updatedStudent  = StudentFactory.getStudent("TestID", "TestName2", "TestLastName", "TestEmail");
        studentRepository.update(updatedStudent);
        Assert.assertNotEquals(student.getFirstName(), updatedStudent.getFirstName());
        System.out.println(studentRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(studentRepository.getAll());
        studentRepository.delete(student.getUserID());
        Student studentTor = studentRepository.read(student.getUserID());
        assertNull(studentTor);
        System.out.println(studentRepository.getAll());

    }
}