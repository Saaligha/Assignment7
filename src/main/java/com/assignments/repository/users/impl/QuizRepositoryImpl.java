package za.ac.cput.repository.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Quiz;
import za.ac.cput.repository.users.QuizRepository;

import java.util.HashSet;
import java.util.Set;

@Repository("PunishmentIfBunkedAlotInMemory")
public class QuizRepositoryImpl implements QuizRepository {

    private static QuizRepositoryImpl repository = null;
    private Set<Quiz> quizzes;

    public QuizRepositoryImpl(){
        quizzes = new HashSet<>();
    }


    public static QuizRepositoryImpl getRepository() {

        if(repository == null){
            return new QuizRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Quiz create(Quiz quiz) {

        quizzes.add(quiz);
        return quiz;
    }

    @Override
    public Quiz read(String id) {

        return quizzes.stream().filter(punishmentIfBunkedAlot -> punishmentIfBunkedAlot.getUserID().equals(id)).findAny().orElse(null);
    }

    @Override
    public Quiz update(Quiz quiz) {

        Quiz inDB = read(quiz.getUserID());

        if(inDB != null){
            quizzes.remove(inDB);
            quizzes.add(quiz);
            return quiz;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        Quiz inDB = read(id);
        quizzes.remove(inDB);

    }

    @Override
    public Set<Quiz> getAll() {
        return quizzes;
    }

}

