package com.assignments.repository.impl;

import com.assignments.domain.AdminUser;
import com.assignments.repository.AdminUserRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("AdminUserInMemory")
public class AdminUserRepositoryImpl implements AdminUserRepository {

    private static AdminUserRepositoryImpl repository = null;
    private Set<AdminUser> adminUsers;

    public AdminUserRepositoryImpl(){
        adminUsers = new HashSet<>();
    }


    public static AdminUserRepositoryImpl getRepository() {

        if(repository == null){
            return new AdminUserRepositoryImpl();
        }
        return repository;
    }

    @Override
    public AdminUser create(AdminUser userInstance) {

        adminUsers.add(userInstance);
        return userInstance;
    }

    @Override
    public AdminUser read(String id) {

        return adminUsers.stream().filter(userInstance -> userInstance.getUserId().equals(id)).findAny().orElse(null);
    }

    @Override
    public AdminUser update(AdminUser userInstance) {

        AdminUser inDB = read(userInstance.getUserId());

        if(inDB != null){
            adminUsers.remove(inDB);
            adminUsers.add(userInstance);
            return userInstance;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        AdminUser inDB = read(id);
        adminUsers.remove(inDB);

    }

    @Override
    public Set<AdminUser> getAll() {
        return adminUsers;
    }

}
