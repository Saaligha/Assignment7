package za.ac.cput.repository.users;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.users.Quiz;
import za.ac.cput.factory.users.QuizFactory;
import za.ac.cput.repository.users.impl.QuizRepositoryImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QuizRepositoryTest {

    @Autowired
    private QuizRepositoryImpl punishmentIfBunkedAlotRepository;
    Quiz quiz = QuizFactory.getQuiz("TestID", "TestName", "TestLastName", "TestEmail");

    @Test
    public void a_create() {

        punishmentIfBunkedAlotRepository.create(quiz);
        assertNotNull(punishmentIfBunkedAlotRepository.getAll());
        System.out.println(punishmentIfBunkedAlotRepository.getAll());

    }

    @Test
    public void b_read() {

        Quiz fromSet = punishmentIfBunkedAlotRepository.read(quiz.getUserID());
        assertEquals(quiz, fromSet);
        System.out.println(punishmentIfBunkedAlotRepository.getAll());
    }

    @Test
    public void c_update() {


        Quiz updatedQuiz = QuizFactory.getQuiz("95", "TestName2", "TestLastName", "TestEmail");
        punishmentIfBunkedAlotRepository.update(updatedQuiz);
        Assert.assertNotEquals(quiz.getFirstName(), updatedQuiz.getFirstName());
        System.out.println(punishmentIfBunkedAlotRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(punishmentIfBunkedAlotRepository.getAll());
        punishmentIfBunkedAlotRepository.delete(quiz.getUserID());
        Quiz quizTor = punishmentIfBunkedAlotRepository.read(quiz.getUserID());
        assertNull(quizTor);
        System.out.println(punishmentIfBunkedAlotRepository.getAll());

    }
}