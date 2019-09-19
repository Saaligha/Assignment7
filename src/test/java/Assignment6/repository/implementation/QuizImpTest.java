package Assignment6.repository.implementation;

import Assignment6.domain.Progress.Quiz;
import Assignment6.factory.Progress.QuizFactory;
import Assignment6.repository.Progress.Impl.QuizImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class QuizImpTest {

    private QuizImp repository;
    private Quiz q;

    private Quiz getSaved(){
        Set<Quiz> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.repository = QuizImp.getRepository();
        this.q = QuizFactory.getQuiz("Spanish");
    }

    @Test
    public void create(){
        Quiz q1 = this.repository.create(this.q);
        System.out.println("Created" +q);

        Assert.assertNotNull(q1);
    }
    @Test
    public void update(){
        Quiz q1 = this.repository.create(this.q);
        Quiz q2 = this.repository.create(this.q);
        Quiz q3 = this.repository.create(this.q);

        this.repository.create(q1);
        this.repository.create(q2);

        Quiz updated = this.repository.update(q3);
        Assert.assertEquals(q3, updated);

    }
    @Test
    public void delete(){

        Quiz q1 = this.repository.create(this.q);
        Quiz q2 = this.repository.create(this.q);

        this.repository.create(q1);
        this.repository.create(q2);

        this.repository.delete(q1.getQuizId());
        int a = this.repository.getAll().size();

        Assert.assertEquals(0, a);
    }

    @Test
    public void read(){
        Quiz q1 = this.repository.create(this.q);
        this.repository.create(q1);

        Quiz s = this.repository.read(q1.getQuizId());

        Assert.assertEquals(q1, s);
    }






}