package Assignment6.repository.implementation;

import Assignment6.domain.Demographic;
import Assignment6.domain.Location;
import Assignment6.domain.Subscription;
import Assignment6.repository.RepoA;
import Assignment6.repository.SubscriptionRepo;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository("SubscriptionRepo")
public class SubscriptionImp implements SubscriptionRepo {
    private static SubscriptionImp repository = null;
    private Set<Subscription> sub;
    @Override
    public Set<Subscription> getAll() {
        return null;
    }
    public static SubscriptionRepo getRepository(){
        if(repository == null) repository = new SubscriptionImp();
        return repository;
    }
    @Override
    public Subscription create(Subscription subscription) {
        this.sub.add(subscription);
        return subscription;
    }

    @Override
    public Subscription update(Subscription subscription){this.sub.add(subscription);
        return subscription;
    }

    @Override
    public void delete(String s) {
        this.sub.remove(s);
    }

    @Override
    public Subscription read(String s) {
        return null;
    }
}