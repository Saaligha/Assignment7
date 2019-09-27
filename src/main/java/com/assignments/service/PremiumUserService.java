package com.assignments.service;

import com.assignments.domain.PremiumUser;

import java.util.Set;

public interface PremiumUserService extends IService<PremiumUser, String> {
    Set<PremiumUser> getAll();
}
