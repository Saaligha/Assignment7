package Assignment6.factory;

import Assignment6.domain.LogIn;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogInFactoryTest {

@Test
    public void getPassword(){
    String p = "Sally";

    LogIn a = LogInFactory.getPassword(p);
    System.out.println(a);
    Assert.assertNotNull(a.getPassword());

    }
}
