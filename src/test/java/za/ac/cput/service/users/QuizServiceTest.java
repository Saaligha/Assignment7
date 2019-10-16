package za.ac.cput.service.users;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Quiz;
import za.ac.cput.factory.users.QuizFactory;
import za.ac.cput.service.users.impl.QuizServiceImpl;

import static junit.framework.TestCase.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QuizServiceTest {

    @Autowired
    private QuizServiceImpl punishmentIfBunkedAlotService;
    Quiz quiz = QuizFactory.getQuiz("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {


        punishmentIfBunkedAlotService.create(quiz);

        assertNotNull(punishmentIfBunkedAlotService.getAll());
        System.out.println(punishmentIfBunkedAlotService.getAll());
    }

    @Test
    public void b_read() {


        assertNotNull(punishmentIfBunkedAlotService.getAll());

        Quiz quiz1 = punishmentIfBunkedAlotService.read(quiz.getUserID());

        assertEquals(quiz, quiz1);
        System.out.println(punishmentIfBunkedAlotService.getAll());


    }

    @Test
    public void c_update() {



        assertNotNull(punishmentIfBunkedAlotService.getAll());

        Quiz quiz1 = QuizFactory.getQuiz("TestID", "TestName2", "TestLastName", "TestEmail");
        quiz1.setUserID(quiz.getUserID());
        punishmentIfBunkedAlotService.update(quiz1);

        Quiz quiz2 = punishmentIfBunkedAlotService.read(quiz1.getUserID());

        assertEquals(quiz1, quiz2);
        System.out.println(punishmentIfBunkedAlotService.getAll());

    }

    @Test
    public void d_delete() {



        assertNotNull(punishmentIfBunkedAlotService.getAll());

        punishmentIfBunkedAlotService.delete(quiz.getUserID());

        Quiz notInSet = punishmentIfBunkedAlotService.read(quiz.getUserID());

        assertNull(notInSet);
        System.out.println(punishmentIfBunkedAlotService.getAll());





    }
}