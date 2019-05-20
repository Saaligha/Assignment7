package Assignment6.repository.implementation;

import Assignment6.domain.Demographic;
import Assignment6.domain.Location;
import Assignment6.domain.Quiz;
import Assignment6.repository.QuizRepo;
import Assignment6.repository.RepoA;

import java.util.Set;

public class QuizImp implements QuizRepo {

    public static QuizImp repository = null;
    private Set<Quiz> quiz;

    public QuizImp getRepository(){
        if(repository==null)
            repository = new QuizImp();
        return repository;
    }
    @Override
    public Set<Quiz> getAll() {
        return null;
    }

    @Override
    public Quiz create(Quiz quiz) {
        this.quiz.add(quiz);
        return quiz;
    }

    @Override
    public Quiz update(Quiz quiz) {
        this.quiz.add(quiz);
        return quiz;
    }

    @Override
    public void delete(String s) {
        for(Quiz l: quiz)
        {
            if(l.getQuizId().equals(s))
            {
                this.quiz.remove(l);
            }
        }
    }

    @Override
    public Quiz read(String s) {
        Quiz l = null;
        for(Quiz lang : quiz){
            if(lang.getQuizId().equals(s)){
                System.out.println((lang.getQuizId()));
            }
        }
        return l;
    }
    }

