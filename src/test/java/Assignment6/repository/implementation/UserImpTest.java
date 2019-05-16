package Assignment6.repository.implementation;

import Assignment6.domain.User;
import Assignment6.domain.User;
import Assignment6.factory.CourseFactory;
import Assignment6.factory.UserFactory;
import Assignment6.repository.UserRepo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class UserImpTest {

    private UserRepo repository;
    private User user;
    private User savedUser;


    private User savedUser(){
        Set<User> savedUser =  this.repository.getAll();
        return savedUser.iterator().next();
    }




    @Test
    public void a_create() {
        Object created = this.repository.create(this.user);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.user);
    }

    @Test
    public void b_read() {
        User savedUser = savedUser();
        System.out.println("In read "+ savedUser.getUserName());
        Object read = this.repository.read(savedUser.getUserSname());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedUser, read);
    }

    @Test
    public void e_delete() {
        User savedUser = savedUser();
        this.repository.delete(savedUser.getUserId());
        d_getAll();
    }


    @Test
    public void d_getAll() {
        Set<User> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }


}
