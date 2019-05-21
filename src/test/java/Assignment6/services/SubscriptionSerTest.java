package Assignment6.services;

import Assignment6.domain.Subscription;
import Assignment6.factory.SubscriptionFactory;
import Assignment6.repository.implementation.SubscriptionImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SubscriptionSerTest {
    private SubscriptionImp repository;
    private Subscription sub;

    @Before
    public void setUp() throws Exception
    {
        this.repository = SubscriptionImp.getRepository();
        this.sub = SubscriptionFactory.sub(true);
    }


    @Test
    public void create(){
        Subscription created = this.repository.create(this.sub);
        System.out.println("Created: Subscription" );
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.sub);

    }

    @Test
    public void update(){
        Subscription created = this.repository.create(this.sub);
        Subscription created2 = this.repository.create(this.sub);
        Subscription created3 = this.repository.create(this.sub);
        this.repository.create(created);
        this.repository.create(created2);

        Subscription updated = this.repository.update(created3);
        Assert.assertEquals(created3, updated);
        Assert.assertNotNull(created3);
        System.out.println("Updated" +updated);

    }

    @Test
    public void delete(){

        Subscription created = this.repository.create(this.sub);
        Subscription created2 = this.repository.create(this.sub);

        this.repository.create(created);
        this.repository.create(created2);

        this.repository.delete(String.valueOf(created.isType()));

        int a = this.repository.getAll().size();
        Assert.assertNotNull(created);
        Assert.assertEquals(0, a);
        System.out.println("Deleted" +a);
    }

    @Test
    public void read(){
        Subscription created = this.repository.create(this.sub);
        this.repository.create(created);
        Subscription s = this.repository.read(String.valueOf(created.isType()));

        Assert.assertEquals(created, s);
        Assert.assertNotNull(s);
        System.out.println("Read: " +s);
    }

}
