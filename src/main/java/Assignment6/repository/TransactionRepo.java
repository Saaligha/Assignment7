package Assignment6.repository;

import Assignment6.domain.Course;
import Assignment6.domain.Transaction;

import java.util.Set;

public interface TransactionRepo extends RepoA<Transaction, String> {
    Set<Transaction> getAll();

}
