package Assignment6.repository.implementation;

import Assignment6.domain.Course;
import Assignment6.domain.Demographic;
import Assignment6.domain.Demographic;

import Assignment6.factory.DemographicFactory;
import Assignment6.repository.DemographicRepo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static com.sun.deploy.config.JREInfo.getAll;
import static org.junit.Assert.*;

public class DemographicImpTest {
    private DemographicRepo demoRep;
    private Set<Demographic> demo;

    Demographic d1, d2;

    private Demographic getDemo() {
        Set<Demographic> savedDemo = this.demoRep.getAll();
        return savedDemo.iterator().next();
    }

    @Before
    public void setUp() throws Exception{
        this.demoRep = DemographicImp.getRepo();
    }

    @Test
    public void create(){
        Demographic created = this.demoRep.create(this.getDemo());
        System.out.println("In create, created = " + created);
        getAll();
        assertSame(created, this.demoRep);


    }
    @Test
    public void read() {
        Demographic read = getDemo();
        System.out.println("In read,  = "+ read.getGender());
        Demographic r = this.demoRep.read(read.getGender());
        System.out.println("In read, read = " + r);
        getAll();
        Assert.assertEquals(read, read);
    }

    @Test
    public void delete(){
        Demographic d = getDemo();
        this.demoRep.delete(d.getGender());
        getAll();
    }
    @Test
    public void update(){


    }

    @Test
    public void getAll(){
        Set<Demographic> all = this.demoRep.getAll();
        Assert.assertSame(2, all.size());
    }
}