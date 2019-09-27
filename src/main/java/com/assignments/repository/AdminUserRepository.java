package com.assignments.repository;

import com.assignments.domain.AdminUser;

import java.util.Set;

public interface AdminUserRepository extends IRepository<AdminUser, String> {

    Set<AdminUser> getAll();
}
