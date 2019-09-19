package Assignment6.repository.Payment.Impl;

import Assignment6.domain.Payment.Subscription;
import Assignment6.repository.Payment.SubscriptionRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("SubscriptionImp")
public class SubscriptionImp implements SubscriptionRepo {
    private static SubscriptionImp repository = null;
    private Map<String, Subscription> sub;

    private SubscriptionImp(){
        this.sub = new HashMap<>();
    }

    public static SubscriptionImp getRepository(){
        if(repository == null) repository = new SubscriptionImp();
        return repository;
    }
    @Override
    public Subscription create(Subscription subscription) {
        this.sub.put(String.valueOf(subscription.isType()), subscription);
        return subscription;
    }

    @Override
    public Subscription update(Subscription subscription){this.sub.replace(String.valueOf(subscription.isType()), subscription);
        return subscription;
    }

    @Override
    public void delete(String s) {
        this.sub.remove(s);
    }

    @Override
    public Subscription read(String s) {
        return this.sub.get(s);
    }

    @Override
    public Set<Subscription> getAll() {
        Collection<Subscription> courses = this.sub.values();
        Set<Subscription> set = new HashSet<>();
        set.addAll(courses);
        return set;
    }
}