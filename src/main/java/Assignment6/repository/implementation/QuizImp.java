package Assignment6.repository.implementation;

import Assignment6.domain.Course;
import Assignment6.domain.Demographic;
import Assignment6.domain.Location;
import Assignment6.domain.Quiz;
import Assignment6.repository.QuizRepo;
import Assignment6.repository.RepoA;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("QuizRepo")
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

