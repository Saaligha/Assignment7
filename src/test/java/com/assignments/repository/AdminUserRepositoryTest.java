package com.assignments.repository;


import com.assignments.domain.AdminUser;
import com.assignments.factory.AdminUserFactory;
import com.assignments.repository.impl.AdminUserRepositoryImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminUserRepositoryTest {
    @Autowired
    private AdminUserRepositoryImpl adminUserRepository;
    AdminUser adminUser = AdminUserFactory
            .getUser("1234", "Sally", "Goal");

    @Test
    public void a_create() {
        AdminUser adminUser = AdminUserFactory
                .getUser("1234", "Sally", "Goal");

        adminUserRepository.create(adminUser);
        assertNotNull(adminUserRepository.getAll());
        System.out.println(adminUserRepository.getAll());

    }
    @Test
    public void b_read() {

        AdminUser fromSet = adminUserRepository.read(adminUser.getUserId());
        Assert.assertNull(fromSet);
        System.out.println(adminUserRepository.getAll());
    }

    @Test
    public void c_update() {


        AdminUser updatedUser  = AdminUserFactory.getUser("1234", "Richard", "Smith");
        adminUserRepository.update(updatedUser);
        Assert.assertNotEquals(adminUser.getUserSname(), updatedUser.getUserSname());
        System.out.println(adminUserRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(adminUserRepository.getAll());
        adminUserRepository.delete(adminUser.getUserId());
        AdminUser userTor = adminUserRepository.read(adminUser.getUserId());
        assertNull(userTor);
        System.out.println(adminUserRepository.getAll());

    }

}
