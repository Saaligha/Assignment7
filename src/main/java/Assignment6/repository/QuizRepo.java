package Assignment6.repository;

import Assignment6.domain.Course;
import Assignment6.domain.Quiz;

import java.util.Set;

public interface QuizRepo extends RepoA<Quiz, String> {
    Set<Quiz> getAll();
}
