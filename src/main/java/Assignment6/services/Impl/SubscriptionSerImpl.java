package Assignment6.services.Impl;

import Assignment6.domain.Subscription;
import Assignment6.repository.SubscriptionRepo;
import Assignment6.services.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("SubImpl")
public class SubscriptionSerImpl implements SubscriptionService {

    @Autowired
    @Qualifier("SubscriptionRepo")
    private SubscriptionRepo repository;

    public SubscriptionSerImpl(SubscriptionRepo repository) {
        this.repository = repository;
    }


    @Override
    public Set<Subscription> getAll() {
        return null;
    }

    @Override
    public Subscription create(Subscription type) {
        return repository.create(type);
    }

    @Override
    public Subscription update(Subscription type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Subscription read(String s) {
        return repository.read(s);
    }

}
