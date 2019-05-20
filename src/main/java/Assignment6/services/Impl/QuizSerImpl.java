package Assignment6.services.Impl;

import Assignment6.domain.Course;
import Assignment6.domain.Quiz;
import Assignment6.repository.CourseRepo;
import Assignment6.repository.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("QuizImpl")
public class QuizSerImpl {
    @Autowired
    @Qualifier
    private QuizRepo repository;

    public QuizSerImpl(QuizRepo repository) {
        this.repository = repository;
    }


   // @Override
    public Set<Quiz> getAll() {
        return null;
    }

   // @Override
    public Quiz create(Quiz q) {
        return repository.create(q);
    }

  //  @Override
    public Quiz update(Quiz q) {
        return this.repository.update(q);
    }

   // @Override
    public void delete(String s) {
        repository.delete(s);
    }

   // @Override
    public Quiz read(String s) {
        return repository.read(s);
    }
}
