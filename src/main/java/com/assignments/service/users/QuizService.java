package za.ac.cput.service.users;

import za.ac.cput.domain.users.Quiz;
import za.ac.cput.service.IService;

import java.util.Set;

public interface QuizService extends IService<Quiz, String> {

    Set<Quiz> getAll();

}