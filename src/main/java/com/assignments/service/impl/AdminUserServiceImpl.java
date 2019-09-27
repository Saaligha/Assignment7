package com.assignments.service.impl;

import com.assignments.domain.AdminUser;
import com.assignments.domain.User;
import com.assignments.service.AdminUserService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("AdminUserServiceImpl")
public class AdminUserServiceImpl implements AdminUserService {

    private static  AdminUserServiceImpl repository = null;
    private Set<AdminUser> adminUsers;

    public AdminUserServiceImpl(){
        adminUsers = new HashSet<>();
    }


    public static AdminUserServiceImpl getRepository() {

        if(repository == null){
            return new AdminUserServiceImpl();
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
