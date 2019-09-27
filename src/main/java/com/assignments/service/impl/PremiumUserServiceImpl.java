package com.assignments.service.impl;

import com.assignments.domain.PremiumUser;
import com.assignments.service.PremiumUserService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service("PremiumUserServiceImpl")
public class PremiumUserServiceImpl implements PremiumUserService {

    private static  PremiumUserServiceImpl repository = null;
    private Set<PremiumUser> premiumUsers;

    public PremiumUserServiceImpl(){
        premiumUsers = new HashSet<>();
    }

    public static PremiumUserServiceImpl getRepository() {

        if(repository == null){
            return new PremiumUserServiceImpl();
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
