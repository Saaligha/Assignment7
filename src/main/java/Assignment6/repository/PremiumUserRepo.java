package Assignment6.repository;

import Assignment6.domain.PremiumUser;
import Assignment6.domain.User;
import Assignment6.repository.RepoA;

import java.util.Set;

public interface PremiumUserRepo extends RepoA<PremiumUser,String> {
    Set<User> getAll();
}
