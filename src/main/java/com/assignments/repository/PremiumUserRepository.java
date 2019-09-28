package com.assignments.repository;

import com.assignments.domain.PremiumUser;

import java.util.Set;

public interface PremiumUserRepository extends IRepository<PremiumUser,String> {
    public abstract Set<PremiumUser> getAll();
}
