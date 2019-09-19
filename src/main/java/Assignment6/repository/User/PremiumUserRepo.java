package Assignment6.repository.User;

import Assignment6.domain.User.PremiumUser;
import Assignment6.domain.User.User;
import Assignment6.repository.RepoA;

import java.util.Set;

public interface PremiumUserRepo extends RepoA<PremiumUser,String> {
    Set<User> getAll();
}
