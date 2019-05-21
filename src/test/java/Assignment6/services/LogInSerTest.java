package Assignment6.services;

import Assignment6.domain.LogIn;
import Assignment6.factory.LogInFactory;
import Assignment6.repository.implementation.LogInImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import sun.rmi.runtime.Log;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LogInSerTest {
    private LogInImp repository;
    private LogIn log;


    @Before
    public void setUp() throws Exception{
        this.repository = LogInImp.getRepository();
        this.log = LogInFactory.getPassword("password", "id456");

    }
    @Test
    public void create(){
        LogIn created = this.repository.create(this.log);
        System.out.println("Created: Log In " +created );
        Assert.assertNotNull(created);
         Assert.assertSame(created, this.log);

    }

    @Test
    public void update(){
        LogIn created = this.repository.create(this.log);
        LogIn created2 = this.repository.create(this.log);
        LogIn created3 = this.repository.create(this.log);
        this.repository.create(created);
        this.repository.create(created2);

        LogIn updated = this.repository.update(created3);
        Assert.assertEquals(created3, updated);
        Assert.assertNotNull(created3);
        System.out.println("Updated" +updated);

    }
    @Test
    public void delete(){

        LogIn created = this.repository.create(this.log);

        this.repository.create(created);


        this.repository.delete(created.getUserId());

        int a = this.repository.getAll().size();
        Assert.assertNotNull(created);
        Assert.assertEquals(0, a);
        System.out.println("Deleted" +a);
    }

    @Test
    public void read(){
        LogIn created = this.repository.create(this.log);
        this.repository.create(created);
        LogIn s = this.repository.read(created.getUserId());

        Assert.assertEquals(created, s);
        Assert.assertNotNull(s);
        System.out.println("Read: " +s);
    }
}
