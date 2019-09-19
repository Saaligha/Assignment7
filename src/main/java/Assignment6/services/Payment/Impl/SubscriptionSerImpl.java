package Assignment6.services.Payment.Impl;

import Assignment6.domain.Payment.Subscription;
import Assignment6.repository.Payment.SubscriptionRepo;
import Assignment6.services.Payment.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("SubscriptionSerImpl")
public class SubscriptionSerImpl implements SubscriptionService {

    @Autowired
    @Qualifier("SubscriptionImp")
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
