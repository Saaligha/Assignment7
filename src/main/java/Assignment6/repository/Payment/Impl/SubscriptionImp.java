package Assignment6.repository.Payment.Impl;

import Assignment6.domain.Payment.Subscription;
import Assignment6.repository.Payment.SubscriptionRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("SubscriptionInMemory")
public class SubscriptionImp implements SubscriptionRepo {
    private static SubscriptionImp subRepository = null;
    private Set<Subscription> subscriptions;

    private SubscriptionImp(){
        this.subscriptions = new HashSet<>();
    }

    public static SubscriptionImp getRepository(){
        if(subRepository == null) subRepository = new SubscriptionImp();
        return subRepository;
    }
    @Override
    public Subscription create(Subscription subscription) {
        subscriptions.add(subscription);
        return subscription;
    }

    @Override
    public Subscription update(Subscription subscription){
        Subscription inDB = read(subscription.getType());

        if(inDB != null){
            subscriptions.remove(inDB);
            subscriptions.add(subscription);
            return subscription;
        }

        return null;
    }

    @Override
    public void delete(String type) {
        this.subscriptions.remove(type);
    }

    @Override
    public Subscription read(String type) {
        return subscriptions.stream().filter(subscription -> subscription.getType().equals(type)).findAny().orElse(null);

    }

    @Override
    public Set<Subscription> getAll() {
        return subscriptions;
    }
}