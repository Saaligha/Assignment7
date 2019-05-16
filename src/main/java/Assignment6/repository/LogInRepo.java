package Assignment6.repository;

import Assignment6.domain.Course;
import Assignment6.domain.LogIn;

import java.util.Set;

public interface LogInRepo extends RepoA<LogIn, String> {
    Set<LogIn> getAll();
}
