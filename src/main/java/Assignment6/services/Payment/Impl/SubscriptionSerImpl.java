package Assignment6.services.Payment.Impl;

import Assignment6.domain.Payment.Subscription;
import Assignment6.repository.Payment.Impl.SubscriptionImp;
import Assignment6.repository.Payment.SubscriptionRepo;
import Assignment6.services.Payment.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("SubscriptionServiceImpl")
public class SubscriptionSerImpl implements SubscriptionService {

    private SubscriptionSerImpl service = null;
    private SubscriptionRepo repository;

    public SubscriptionSerImpl() {
        this.repository = SubscriptionImp.getRepository();
    }
    public SubscriptionSerImpl getService(){
        if(service== null){
            service = new SubscriptionSerImpl();
        }
        return service;
    }

    @Override
    public Set<Subscription> getAll() {
        return this.repository.getAll();
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
