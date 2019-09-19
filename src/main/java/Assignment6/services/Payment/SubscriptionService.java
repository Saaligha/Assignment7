package Assignment6.services.Payment;

import Assignment6.domain.Payment.Subscription;
import Assignment6.services.IService;

import java.util.Set;

public interface SubscriptionService extends IService<Subscription, String> {
    Set<Subscription> getAll();
}
