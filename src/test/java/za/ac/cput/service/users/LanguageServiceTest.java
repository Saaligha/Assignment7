package za.ac.cput.service.users;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Language;
import za.ac.cput.factory.users.LanguageFactory;
import za.ac.cput.service.users.impl.LanguageServiceImpl;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LanguageServiceTest {

    @Autowired
    private LanguageServiceImpl attendanceService;
    Language language = LanguageFactory.getAttendance("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {


        attendanceService.create(language);

        assertNotNull(attendanceService.getAll());
        System.out.println(attendanceService.getAll());
    }

    @Test
    public void b_read() {


        assertNotNull(attendanceService.getAll());

        Language language1 = attendanceService.read(language.getUserID());

        assertEquals(language, language1);
        System.out.println(attendanceService.getAll());


    }

    @Test
    public void c_update() {



        assertNotNull(attendanceService.getAll());

        Language language1 = LanguageFactory.getAttendance("TestID", "TestName2", "TestLastName", "TestEmail");
        language1.setUserID(language.getUserID());
        attendanceService.update(language1);

        Language language2 = attendanceService.read(language1.getUserID());

        assertEquals(language1, language2);
        System.out.println(attendanceService.getAll());

    }

    @Test
    public void d_delete() {



        assertNotNull(attendanceService.getAll());

        attendanceService.delete(language.getUserID());

        Language notInSet = attendanceService.read(language.getUserID());

        assertNull(notInSet);
        System.out.println(attendanceService.getAll());





    }
}