package Assignment6.repository.User.Impl;

import Assignment6.domain.User.PremiumUser;
import Assignment6.domain.User.User;
import Assignment6.repository.User.UserRepo;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;
@Repository("UserInMemory")
public class UserImp implements UserRepo {

    private static UserImp repository = null;
    private Set<User> users;


    private UserImp() {
        this.users = new HashSet<>();
    }

    public static UserImp getRepository() {
        if (repository == null) repository = new UserImp();
        return repository;
    }

    public User create(User users) {
        this.users.add(users);
        return users;
    }

    public User read(String id) {
        return users.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);

    }

    public User update(User user) {
        User inDB = read(user.getUserId());

        if(inDB != null){
            users.remove(inDB);
            users.add(user);
            return user;
        }

        return null;
    }

    public void delete(String user) {
      this.users.remove(user);


    }

    @Override
    public Set<User> getAll() {
        return users;
    }
}