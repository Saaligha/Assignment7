package com.assignments.factory;


import com.assignments.domain.AdminUser;


public class AdminUserFactory {

    public static AdminUser getUser(String userId, String userName, String userSname){
        return new AdminUser.Builder().userId(userId).userName(userName).userSname(userSname).build();
    }

}
