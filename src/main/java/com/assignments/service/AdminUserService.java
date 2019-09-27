package com.assignments.service;

import com.assignments.domain.AdminUser;

import java.util.Set;

public interface AdminUserService  extends IService<AdminUser, String>{

    Set<AdminUser> getAll();
}
