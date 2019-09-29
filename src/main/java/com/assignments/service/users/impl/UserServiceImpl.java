package za.ac.cput.service.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.User;
import za.ac.cput.repository.users.UserRepository;
import za.ac.cput.repository.users.impl.UserRepositoryImpl;
import za.ac.cput.service.users.UserService;

import java.util.Set;

@Repository("HODServiceImpl")
public class UserServiceImpl implements UserService {

    private UserServiceImpl service = null;
    private UserRepository repository;

    public UserServiceImpl() {
        repository = UserRepositoryImpl.getRepository();
    }

    public UserServiceImpl getService(){

        if(service == null){
            return new UserServiceImpl();
        }
        return service;
    }

    @Override
    public Set<User> getAll() {
        return this.repository.getAll();
    }

    @Override
    public User create(User user) {
        return repository.create(user);
    }

    @Override
    public User read(String integer) {
        return repository.read(integer);
    }

    @Override
    public User update(User user) {
        return repository.update(user);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }



}

