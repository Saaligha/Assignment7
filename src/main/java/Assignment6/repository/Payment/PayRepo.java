package Assignment6.repository.Payment;

import Assignment6.domain.Payment.Pay;
import Assignment6.repository.RepoA;

import java.util.Set;

public interface PayRepo extends RepoA<Pay, String> {
    Set<Pay> getAll();
}
