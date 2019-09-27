package com.assignments.factory;


import com.assignments.domain.AdminUser;
import org.junit.Assert;
import org.junit.Test;

public class AdminFactoryTest {
    @Test
    public void getAdminUser(){
        AdminUser adminUser = AdminUserFactory.getUser("1", "Saaligha", "Logday");
        Assert.assertNotNull(adminUser);
        System.out.println(adminUser);
    }
}
