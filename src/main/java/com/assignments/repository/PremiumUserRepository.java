package com.assignments.repository;

import com.assignments.domain.PremiumUser;

import java.util.Set;

public interface PremiumUserRepository extends IRepository<PremiumUser,String> {
    Set<PremiumUser> getAll();
}
