package Assignment6.repository;

import Assignment6.domain.Course;
import Assignment6.domain.Subscription;

import java.util.Set;

public interface SubscriptionRepo extends RepoA<Subscription, String> {
    Set<Subscription> getAll();
}