package za.ac.cput.service.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Quiz;
import za.ac.cput.repository.users.QuizRepository;
import za.ac.cput.repository.users.impl.QuizRepositoryImpl;
import za.ac.cput.service.users.QuizService;

import java.util.Set;

@Repository("PunishmentIfBunkedAlotServiceImpl")
public class QuizServiceImpl implements QuizService {

    private QuizServiceImpl service = null;
    private QuizRepository repository;

    public QuizServiceImpl() {
        repository = QuizRepositoryImpl.getRepository();
    }

    public QuizServiceImpl getService(){

        if(service == null){
            return new QuizServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Quiz> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Quiz create(Quiz quiz) {
        return repository.create(quiz);
    }

    @Override
    public Quiz read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Quiz update(Quiz quiz) {
        return repository.update(quiz);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }



}

