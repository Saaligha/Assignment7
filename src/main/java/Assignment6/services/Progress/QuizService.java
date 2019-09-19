package Assignment6.services.Progress;

import Assignment6.domain.Progress.Quiz;
import Assignment6.services.IService;

import java.util.Set;

public interface QuizService extends IService<Quiz, String> {
    Set<Quiz> getAll();
}
