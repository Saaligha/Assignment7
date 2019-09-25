package Assignment6.services.User.Impl;

import Assignment6.domain.User.User;
import Assignment6.repository.User.Impl.UserRepoImp;
import Assignment6.repository.User.UserRepo;
import Assignment6.services.User.UserService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
    private UserRepo userRepo;
    private UserServiceImpl userService = null;

    public UserServiceImpl(){
        this.userRepo = UserRepoImp.getRepository();
    }

    public UserServiceImpl getUserService(){
        if(userService == null){
            userService = new UserServiceImpl();
        }
        return userService;
    }

    @Override
    public Set<User> getAll() {
        return this.userRepo.getAll();
    }

    @Override
    public User create(User id) {
        return this.userRepo.create(id);
    }

    @Override
    public User update(User id) {
        return this.userRepo.update(id);
    }

    @Override
    public void delete(String id) {
         userRepo.delete(id);
    }

    @Override
    public User read(String id) {
        return userRepo.read(id);
    }
}
