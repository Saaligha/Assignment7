package Assignment6.repository.Progress;

import Assignment6.domain.Progress.Quiz;
import Assignment6.repository.RepoA;

import java.util.Set;

public interface QuizRepo extends RepoA<Quiz, String> {
    Set<Quiz> getAll();
}
