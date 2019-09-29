package za.ac.cput.factory.users;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.users.Quiz;

public class QuizFactoryTest {

    @Test
    public void getQuiz() {

        Quiz quiz = QuizFactory.getQuiz( "456", "First Quiz", "", "");
        Assert.assertNotNull(quiz);
    }
}