package Assignment6.services.Progress.Impl;

import Assignment6.domain.Progress.Quiz;
import Assignment6.repository.Progress.Impl.QuizImp;
import Assignment6.repository.Progress.QuizRepo;
import Assignment6.services.Progress.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("QuizServiceImpl")
public class QuizSerImpl implements QuizService {

    private QuizRepo repository;
    private QuizSerImpl service = null;
    public QuizSerImpl( ) {
        this.repository = QuizImp.getRepository();
    }

public QuizSerImpl getService(){
        if(service==null){
            service= new QuizSerImpl();
        }
        return service;
}
    @Override
    public Set<Quiz> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Quiz create(Quiz q) {
        return repository.create(q);
    }

    @Override
    public Quiz update(Quiz q) {
        return this.repository.update(q);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Quiz read(String s) {
        return repository.read(s);
    }
}
