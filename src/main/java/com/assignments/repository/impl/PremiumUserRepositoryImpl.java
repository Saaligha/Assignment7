package com.assignments.repository.impl;

import com.assignments.domain.PremiumUser;
import com.assignments.repository.PremiumUserRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("PremiumUserInMemory")
public class PremiumUserRepositoryImpl implements PremiumUserRepository {

    private static  PremiumUserRepositoryImpl repository = null;
    private Set<PremiumUser> premiumUsers;

    public PremiumUserRepositoryImpl(){
        premiumUsers = new HashSet<>();
    }
    public static PremiumUserRepositoryImpl getRepository() {

        if(repository == null){
            return new PremiumUserRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Set<PremiumUser> getAll() {
        return premiumUsers;
    }

    @Override
    public PremiumUser create(PremiumUser premiumUser) {
        premiumUsers.add(premiumUser);
        return premiumUser;
    }

    @Override
    public PremiumUser read(String id) {
        return premiumUsers.stream().filter(premiumUser -> premiumUser.getUserId().equals(id)).findAny().orElse(null);

    }

    @Override
    public PremiumUser update(PremiumUser premiumUser) {
        PremiumUser inDB = read(premiumUser.getUserId());

        if(inDB != null){
            premiumUsers.remove(inDB);
            premiumUsers.add(premiumUser);
            return premiumUser;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        PremiumUser inDB = read(id);
        premiumUsers.remove(inDB);
    }
}
