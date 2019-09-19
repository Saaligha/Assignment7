package Assignment6.repository.Payment;

import Assignment6.domain.Payment.Subscription;
import Assignment6.repository.RepoA;

import java.util.Set;

public interface SubscriptionRepo extends RepoA<Subscription, String> {
    Set<Subscription> getAll();
}