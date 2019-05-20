package Assignment6.services;

import Assignment6.domain.Quiz;

import java.util.Set;

public interface QuizService extends IService<Quiz, String> {
    Set<Quiz> getAll();
}
