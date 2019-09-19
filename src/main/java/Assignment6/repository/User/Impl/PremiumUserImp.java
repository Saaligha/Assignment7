package Assignment6.repository.User.Impl;

import Assignment6.domain.User.PremiumUser;
import Assignment6.domain.User.User;
import Assignment6.repository.User.PremiumUserRepo;
import Assignment6.repository.User.UserRepo;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("PremiumUserInMemory")
public class PremiumUserImp implements PremiumUserRepo {

    private static PremiumUserImp repository = null;
    private Set<PremiumUser> Pusers;


    private PremiumUserImp() {
        this.Pusers = new HashSet<>();
    }

    public static PremiumUserImp getRepository() {
        if (repository == null) repository = new PremiumUserImp();
        return repository;
    }

    @Override
    public Set<PremiumUser> getAll() {
        return Pusers;
    }

    @Override
    public PremiumUser create(PremiumUser premiumUser) {
        Pusers.add(premiumUser);
        return premiumUser;
    }

    @Override
    public PremiumUser update(PremiumUser premiumUser) {
        PremiumUser inDB = read(premiumUser.getUserId());

        if(inDB != null){
            Pusers.remove(inDB);
            Pusers.add(premiumUser);
            return premiumUser;
        }

        return null;
    }

    @Override
    public void delete(String id) {
        PremiumUser inDB = read(id);
        Pusers.remove(inDB);
    }

    @Override
    public PremiumUser read(String id) {
        return Pusers.stream().filter(premiumUser -> premiumUser.getUserId().equals(id)).findAny().orElse(null);

    }
}