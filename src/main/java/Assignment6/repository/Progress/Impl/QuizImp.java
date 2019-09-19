package Assignment6.repository.Progress.Impl;

import Assignment6.domain.Progress.Quiz;
import Assignment6.repository.Progress.QuizRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("QuizImp")
public class QuizImp implements QuizRepo {

    public static QuizImp repository = null;
    private Map<String ,Quiz> quiz;

    private QuizImp(){this.quiz = new HashMap<>();
    }


    public static QuizImp getRepository(){
        if(repository==null)
            repository = new QuizImp();
        return repository;
    }




    @Override
    public Set<Quiz> getAll() {
        Collection<Quiz> quiz = this.quiz.values();
        Set<Quiz> set = new HashSet<>();
        set.addAll(quiz);
        return set;
    }

    @Override
    public Quiz create(Quiz quiz) {
        this.quiz.put(quiz.getQuizId(), quiz);
        return quiz;
    }

    @Override
    public Quiz update(Quiz quiz) {
        this.quiz.replace(quiz.getQuizId(), quiz);
        return quiz;
    }

    @Override
    public void delete(String quizId) {
        this.quiz.remove(quizId);
    }

    @Override
    public Quiz read(String quizId) {
        return this.quiz.get(quizId);
    }
    }

