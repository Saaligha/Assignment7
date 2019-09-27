package com.assignments.repository.impl;

import com.assignments.domain.AdminUser;
import com.assignments.factory.AdminUserFactory;
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
public class AdminUserRepositoryImplTest {
@Autowired
private AdminUserRepositoryImpl adminUserRepository;
AdminUser admin = AdminUserFactory.getUser("21", "Jonah", "Hill");


    @Test
    public void create() {

        adminUserRepository.create(admin);
        assertNotNull(adminUserRepository.getAll());
        System.out.println(adminUserRepository.getAll());
    }

    @Test
    public void read() {
        AdminUser fromSet = adminUserRepository.read(admin.getUserId());
        assertNull(fromSet);
        System.out.println(adminUserRepository.getAll());
    }

    @Test
    public void update() {
        AdminUser updatedAdmin = AdminUserFactory.getUser("21", "William", "Michealson");
        adminUserRepository.update(updatedAdmin);
        Assert.assertNotEquals(admin.getUserId(), admin.getUserName(), admin.getUserSname());
        System.out.println(adminUserRepository.getAll());
    }

    @Test
    public void delete() {
        assertNotNull(adminUserRepository.getAll());
        adminUserRepository.delete(admin.getUserId());

        AdminUser adTo = adminUserRepository.read(admin.getUserId());
        assertNull(adTo);
        System.out.println(adminUserRepository.getAll());
    }

    @Test
    public void getAll() {
    }
}