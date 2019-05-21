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

public class DemographicImpTest {    private DemographicImp repository;
    private Demographic demo;

    @Before
    public void setUp() throws Exception{
        this.repository = DemographicImp.getRepo();
        this.demo = DemographicFactory.demo("Indian");
    }
    @Test
    public void create(){
        Demographic created = this.repository.create(this.demo);
        System.out.println("Created: Location" );
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.demo);

    }

    @Test
    public void update(){
        Demographic created = this.repository.create(this.demo);
        Demographic created2 = this.repository.create(this.demo);
        Demographic created3 = this.repository.create(this.demo);
        this.repository.create(created);
        this.repository.create(created2);

        Demographic updated = this.repository.update(created3);
        Assert.assertEquals(created3, updated);
        Assert.assertNotNull(created3);
        System.out.println("Updated" +updated);

    }

    @Test
    public void delete(){

        Demographic created = this.repository.create(this.demo);
        Demographic created2 = this.repository.create(this.demo);

        this.repository.create(created);
        this.repository.create(created2);

        this.repository.delete(created.getGender());
        this.repository.delete(created.getRace());

        int a = this.repository.getAll().size();
        Assert.assertNotNull(created);
        Assert.assertEquals(0, a);
        System.out.println("Deleted:" +a);
    }
}