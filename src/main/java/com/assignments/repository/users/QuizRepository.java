package za.ac.cput.repository.users;

import za.ac.cput.domain.users.Quiz;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface QuizRepository extends IRepository<Quiz, String> {

    Set<Quiz> getAll();

}