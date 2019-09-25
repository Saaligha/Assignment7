package Assignment6.services.User;

import Assignment6.domain.User.PremiumUser;
import Assignment6.services.IService;

import java.util.Set;

public interface PremiumUserService extends IService<PremiumUser, String> {
    Set<PremiumUser> getAll();
}
