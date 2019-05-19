package Assignment6.repository.implementation;

import Assignment6.domain.LogIn;
import Assignment6.repository.LogInRepo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class LogInImpTest {

    private LogInRepo loginrepo;
    private Set<LogIn> classes;

    LogIn l1, l2;

    @Before
    public void setUp() throws Exception{
        this.loginrepo = LogInImp.getRepository();

    }
    @Test
    public void create() {
        l1 = new LogIn.Builder().UserId("456").Password("456").build();
        l2 = new LogIn.Builder().UserId("123").Password("123").build();

        LogIn l = this.loginrepo.create(l1);
        LogIn ll = this.loginrepo.create(l2);
        Assert.assertEquals(l1, l);
        Assert.assertEquals(l2, ll);

    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }

    @Test
    public void create1() {
    }

    @Test
    public void update1() {
    }

    @Test
    public void delete1() {
    }

    @Test
    public void read1() {
    }
}