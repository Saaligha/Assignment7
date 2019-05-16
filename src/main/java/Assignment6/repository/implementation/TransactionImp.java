package Assignment6.repository.implementation;

import Assignment6.domain.Course;
import Assignment6.domain.Transaction;
import Assignment6.repository.CourseRepo;
import Assignment6.repository.TransactionRepo;

import java.util.HashSet;
import java.util.Set;

public class TransactionImp implements TransactionRepo
{

    private static TransactionImp repository = null;
    private Set<Transaction> transaction;

    private TransactionImp() {
        this.transaction = new HashSet<>();
    }

    public static TransactionRepo getRepository(){
        if(repository == null) repository = new TransactionImp();
        return repository;
    }

    @Override
    public Set<Transaction> getAll() {
        return null;
    }

    @Override
    public Transaction create(Transaction transaction) {
        this.transaction.add(transaction);
        return transaction;
    }

    @Override
    public Transaction update(Transaction transaction) {
        this.transaction.add(transaction);
        return transaction;
    }

    @Override
    public void delete(String s) {
     this.transaction.remove(transaction);

    }

    @Override
    public Transaction read(String s) {
        return null;
    }
}
