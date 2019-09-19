package Assignment6.repository.LogIn;

import Assignment6.domain.LogIn.LogIn;
import Assignment6.repository.RepoA;

import java.util.Set;

public interface LogInRepo extends RepoA<LogIn, String> {
    Set<LogIn> getAll();
}
