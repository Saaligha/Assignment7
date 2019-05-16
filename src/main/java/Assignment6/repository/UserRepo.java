package Assignment6.repository;

import Assignment6.domain.User;


import java.util.Set;

public interface UserRepo extends RepoA {
    Set<User> getAll();
}
