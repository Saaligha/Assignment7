package com.assignments.repository.impl;

import com.assignments.domain.PremiumUser;
import com.assignments.factory.PremiumUserFactory;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PremiumUserRepositoryImplTest {
 @Autowired

    private PremiumUserRepositoryImpl premiumUserRepository;
    PremiumUser premiumUser = PremiumUserFactory.getPremiumUser("1","Premium","User");

    @Test
    public void create() {
    premiumUserRepository.create(premiumUser);
    assertNotNull(premiumUserRepository.getAll());
        System.out.println(premiumUserRepository.getAll());
    }

    @Test
    public void read() {
        PremiumUser fromSet = PremiumUserFactory.getPremiumUser("1","Premium","User");

        assertNotNull(fromSet);
        System.out.println(premiumUserRepository.getAll());
    }

    @Test
    public void update() {
        PremiumUser updatedUser  = PremiumUserFactory.getPremiumUser("1234", "Richard", "Smith");
        premiumUserRepository.update(updatedUser);
        Assert.assertNotEquals(premiumUser.getUserSname(), updatedUser.getUserSname());
        System.out.println(premiumUserRepository.getAll());
    }

    @Test
    public void delete() {
        assertNotNull(premiumUserRepository.getAll());
        premiumUserRepository.delete(premiumUser.getUserId());
        PremiumUser userTor = premiumUserRepository.read(premiumUser.getUserId());
        assertNull(userTor);
        System.out.println(premiumUserRepository.getAll());
    }
}
