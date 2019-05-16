package Assignment6.repository.implementation;

import Assignment6.domain.Course;
import Assignment6.domain.Transaction;
import Assignment6.domain.Transaction;
import Assignment6.factory.CourseFactory;
import Assignment6.repository.CourseRepo;
import Assignment6.repository.TransactionRepo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class TransactionImpTest {

    private TransactionRepo repository;
    private Transaction t;


    private Transaction savedT() {
        Set<Transaction> savedT = this.repository.getAll();
        return savedT.iterator().next();
    }

    @Test
    public void a_create() {
        Transaction created = this.repository.create(this.t);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.t);
    }
    @Test
    public void b_read() {
        Transaction t = savedT();
        System.out.println("In read, courseId = "+ t.getAccBalance());


        d_getAll();
        Assert.assertEquals(t, savedT());
    }

    @Test
    public void e_delete() {
        Transaction t = savedT();
        this.repository.delete(String.valueOf(t.getAccountNumber()));
        d_getAll();
    }
    @Test
    public void d_getAll() {
        Set<Transaction> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }




}
