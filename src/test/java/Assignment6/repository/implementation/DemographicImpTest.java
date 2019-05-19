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
    public void delete(){
      String s = "4";
      this.demoRep.delete(s);
      demo = this.demoRep.getAll();
      int size = demo.size();
      Assert.assertNotEquals(1, size);
    }
    @Test
    public void update(){
    d1 = new Demographic.Builder().setRace("Asian").build();
    Demographic d = this.demoRep.update(d1);
    Assert.assertNotEquals(d1, d);
    }

    @Test
    public void getAll(){
        demo = this.demoRep.getAll();
        Assert.assertEquals(0, demo.size());
    }
}