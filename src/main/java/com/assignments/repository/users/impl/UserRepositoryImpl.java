package za.ac.cput.repository.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.User;
import za.ac.cput.repository.users.UserRepository;

import java.util.HashSet;
import java.util.Set;

@Repository("HODInMemory")
public class UserRepositoryImpl implements UserRepository {

    private static UserRepositoryImpl repository = null;
    private Set<User> users;

    public UserRepositoryImpl(){
        users = new HashSet<>();
    }


    public static UserRepositoryImpl getRepository() {

        if(repository == null){
            return new UserRepositoryImpl();
        }
        return repository;
    }

    @Override
    public User create(User user) {

        users.add(user);
        return user;
    }

    @Override
    public User read(String id) {

        return users.stream().filter(hod -> hod.getUserID().equals(id)).findAny().orElse(null);
    }

    @Override
    public User update(User user) {

        User inDB = read(user.getUserID());

        if(inDB != null){
            users.remove(inDB);
            users.add(user);
            return user;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        User inDB = read(id);
        users.remove(inDB);

    }

    @Override
    public Set<User> getAll() {
        return users;
    }

}

