package Assignment6.factory;

import Assignment6.domain.LogIn;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogInFactoryTest {
 private String logIn;
 @Before
    public void setUp() throws Exception{
     this.logIn = "logIn";
 }

 @Test
    public void buildLogIn(){

     LogIn logIn = LogInFactory.getPassword(this.logIn, this.logIn);
     Assert.assertNotNull(logIn.getPassword());

     Assert.assertNotNull(logIn);
 }
}
