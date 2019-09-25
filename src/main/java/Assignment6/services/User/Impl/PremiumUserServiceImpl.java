package Assignment6.services.User.Impl;

import Assignment6.domain.User.PremiumUser;
import Assignment6.repository.User.Impl.PremiumUserRepoImp;
import Assignment6.services.User.PremiumUserService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PremiumUserServiceImpl implements PremiumUserService {
    private PremiumUserRepoImp repository;
    private PremiumUserServiceImpl premiumUserService = null;

    public PremiumUserServiceImpl(){
        this.repository = PremiumUserRepoImp.getRepository();
    }

    public PremiumUserRepoImp getRepository() {
        if(premiumUserService==null){
            premiumUserService = new PremiumUserServiceImpl();
        }
        return repository;
    }

    @Override
    public Set<PremiumUser> getAll() {
        return this.repository.getAll();
    }

    @Override
    public PremiumUser create(PremiumUser id) {
        return this.repository.create(id);
    }

    @Override
    public PremiumUser update(PremiumUser id) {
        return this.repository.update(id);
    }

    @Override
    public void delete(String id) {
      this.repository.delete(id);
    }

    @Override
    public PremiumUser read(String id) {
        return this.repository.read(id);
    }
}
