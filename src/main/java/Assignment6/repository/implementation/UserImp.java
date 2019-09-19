package Assignment6.repository.implementation;

import Assignment6.domain.Demographic;
import Assignment6.domain.Location;
import Assignment6.domain.User;
import Assignment6.repository.RepoA;
import Assignment6.repository.UserRepo;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;
@Repository("UserImp")
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

    public User read(String s) {
        User r = null;
        for (User cla: users){
            if (cla.getUserName().equals(s)) {
                System.out.println(cla.getUserName() + cla.getUserSname());
                r = new User.Builder().UserName(s).UserSname(s).UserId(s).build();
            }
        }

        return r;
    }

    public User update(User user) {

        this.users.add(user);
        return user;
    }

    public void delete(String user) {
      this.users.remove(user);
     // return user;

    }

    @Override
    public Set<User> getAll() {
        return null;
    }
}