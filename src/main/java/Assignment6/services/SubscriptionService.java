package Assignment6.services;

import Assignment6.domain.Subscription;

import java.util.Set;

public interface SubscriptionService extends IService<Subscription, String> {
    Set<Subscription> getAll();
}
