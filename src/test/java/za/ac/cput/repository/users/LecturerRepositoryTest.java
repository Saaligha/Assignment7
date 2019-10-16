package za.ac.cput.repository.users;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Lecturer;
import za.ac.cput.factory.users.LecturerFactory;
import za.ac.cput.repository.users.impl.LecturerRepositoryImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LecturerRepositoryTest {

    @Autowired
    private LecturerRepositoryImpl lecturerRepository;
    Lecturer lecturer = LecturerFactory.getLecturer("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {

        lecturerRepository.create(lecturer);
        assertNotNull(lecturerRepository.getAll());
        System.out.println(lecturerRepository.getAll());

    }

    @Test
    public void b_read() {

        Lecturer fromSet = lecturerRepository.read(lecturer.getUserID());
        assertEquals(lecturer, fromSet);
        System.out.println(lecturerRepository.getAll());
    }

    @Test
    public void c_update() {


        Lecturer updatedLecturer  = LecturerFactory.getLecturer("TestID", "TestName2", "TestLastName", "TestEmail");
        lecturerRepository.update(updatedLecturer);
        Assert.assertNotEquals(lecturer.getFirstName(), updatedLecturer.getFirstName());
        System.out.println(lecturerRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(lecturerRepository.getAll());
        lecturerRepository.delete(lecturer.getUserID());
        Lecturer lecturerTor = lecturerRepository.read(lecturer.getUserID());
        assertNull(lecturerTor);
        System.out.println(lecturerRepository.getAll());

    }
}