package za.ac.cput.repository.users;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Language;
import za.ac.cput.factory.users.LanguageFactory;
import za.ac.cput.repository.users.impl.LanguageRepositoryImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LanguageRepositoryTest {

    @Autowired
    private LanguageRepositoryImpl attendanceRepository;
    Language language = LanguageFactory.getAttendance("1", "English", "", "");

    @Test
    public void a_create() {

        attendanceRepository.create(language);
        assertNotNull(attendanceRepository.getAll());
        System.out.println(attendanceRepository.getAll());

    }

    @Test
    public void b_read() {

        Language fromSet = attendanceRepository.read(language.getUserID());
        assertEquals(language, fromSet);
        System.out.println(attendanceRepository.getAll());
    }

    @Test
    public void c_update() {


        Language updatedLanguage = LanguageFactory.getAttendance("1", "Afrikaans", "", "");
        attendanceRepository.update(updatedLanguage);
        Assert.assertNotEquals(language.getFirstName(), updatedLanguage.getFirstName());
        System.out.println(attendanceRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(attendanceRepository.getAll());
        attendanceRepository.delete(language.getUserID());
        Language languageTor = attendanceRepository.read(language.getUserID());
        assertNull(languageTor);
        System.out.println(attendanceRepository.getAll());

    }
}