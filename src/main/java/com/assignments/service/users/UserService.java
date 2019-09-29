package za.ac.cput.service.users;

import za.ac.cput.domain.users.User;
import za.ac.cput.service.IService;

import java.util.Set;

public interface UserService extends IService<User, String> {

    Set<User> getAll();

}