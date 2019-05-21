package Assignment6.services;

import Assignment6.domain.Results;
import Assignment6.factory.ResultsFactory;
import Assignment6.repository.implementation.ResultsImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResultsSerTest {
    private ResultsImp repository;
    private Results res;

    @Before
    public void setUp() throws Exception{
        this.repository = ResultsImp.getRepository();
        this.res = ResultsFactory.getRes(50, 56, true);

    }
    @Test
    public void create(){
        Results created = this.repository.create(this.res);
        System.out.println("Created: Results" );
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.res);

    }
    @Test
    public void update(){
        Results created = this.repository.create(this.res);
        Results created2 = this.repository.create(this.res);
        Results created3 = this.repository.create(this.res);
        this.repository.create(created);
        this.repository.create(created2);

        Results updated = this.repository.update(created3);
        Assert.assertEquals(created3, updated);
        Assert.assertNotNull(created3);
        System.out.println("Updated" +updated);

    }

    @Test
    public void delete(){

        Results created = this.repository.create(this.res);
        Results created2 = this.repository.create(this.res);

        this.repository.create(created);
        this.repository.create(created2);

        this.repository.delete(String.valueOf(created.getSemesterResults()));
        int a = this.repository.getAll().size();
        Assert.assertNotNull(created);
        Assert.assertEquals(1, a);
        System.out.println("Deleted: " +a);
    }

    @Test
    public void read(){
        Results created = this.repository.create(this.res);
        this.repository.create(created);
        Results s = this.repository.read(String.valueOf(created.getSemesterResults()));
        Results s1 = this.repository.read(String.valueOf(created.isPassOrFail()));
        Results s2 = this.repository.read(String.valueOf(created.getFinalResults()));

        Assert.assertNull(s);
        Assert.assertNull(s1);
        Assert.assertNull(s2);
        System.out.println("Read: ");

    }
}
