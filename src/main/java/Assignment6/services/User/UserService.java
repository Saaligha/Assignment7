package Assignment6.services.User;

import Assignment6.domain.User.User;
import Assignment6.services.IService;

import java.util.Set;

public interface UserService extends IService<User,String> {
    Set<User> getAll();
}
