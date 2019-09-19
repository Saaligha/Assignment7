package Assignment6.factory;

import Assignment6.domain.Progress.Quiz;
import Assignment6.factory.Progress.QuizFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuizFactoryTest {

    private String q,q1;

    @Before
    public void setUp() throws Exception{
        this.q = "Spanish";
    }
    @Test
    public void QuizBuild(){

        Quiz q = QuizFactory.getQuiz(this.q);
        Assert.assertNotNull(q.getQuizId());
       // Assert.assertNotNull(q.getQuizDescr());

    }

}
