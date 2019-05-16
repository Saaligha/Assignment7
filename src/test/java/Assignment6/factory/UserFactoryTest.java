package Assignment6.factory;

import Assignment6.domain.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {
private String id, name,sName;

    @Before
    public void setUp() throws Exception {
        this.id = "SL2563";
        this.name = "Sally";
        this.sName = "Brown";

    }

    @Test
    public void buildUserTest(){
        User u = UserFactory.getUser(this.id,this.name, this.sName);
        Assert.assertNotNull(u.getUserId());
        Assert.assertTrue("SL263", true);
        Assert.assertNotNull(u.getUserName());
   }
}