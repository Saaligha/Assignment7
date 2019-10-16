package za.ac.cput.service.users;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Lecturer;
import za.ac.cput.factory.users.LecturerFactory;
import za.ac.cput.service.users.impl.LecturerServiceImpl;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LecturerServiceTest {

    @Autowired
    private LecturerServiceImpl lecturerService;
    Lecturer lecturer = LecturerFactory.getLecturer("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {


        lecturerService.create(lecturer);

        assertNotNull(lecturerService.getAll());
        System.out.println(lecturerService.getAll());
    }

    @Test
    public void b_read() {


        assertNotNull(lecturerService.getAll());

        Lecturer lecturer1 = lecturerService.read(lecturer.getUserID());

        assertEquals(lecturer, lecturer1);
        System.out.println(lecturerService.getAll());


    }

    @Test
    public void c_update() {



        assertNotNull(lecturerService.getAll());

        Lecturer lecturer1 = LecturerFactory.getLecturer("TestID", "TestName2", "TestLastName", "TestEmail");
        lecturer1.setUserID(lecturer.getUserID());
        lecturerService.update(lecturer1);

        Lecturer lecturer2 = lecturerService.read(lecturer1.getUserID());

        assertEquals(lecturer1, lecturer2);
        System.out.println(lecturerService.getAll());

    }

    @Test
    public void d_delete() {



        assertNotNull(lecturerService.getAll());

        lecturerService.delete(lecturer.getUserID());

        Lecturer notInSet = lecturerService.read(lecturer.getUserID());

        assertNull(notInSet);
        System.out.println(lecturerService.getAll());





    }
}