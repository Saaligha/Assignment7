package za.ac.cput.repository.users;

import za.ac.cput.domain.users.User;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface UserRepository extends IRepository<User, String> {

    Set<User> getAll();

}