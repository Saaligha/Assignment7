package Assignment6.repository.User;

import Assignment6.domain.User.User;
import Assignment6.repository.RepoA;


import java.util.Set;

public interface UserRepo extends RepoA<User,String> {
    Set<User> getAll();
}
