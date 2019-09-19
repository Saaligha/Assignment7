package Assignment6.repository.Payment.Impl;

import Assignment6.domain.Payment.Pay;
import Assignment6.repository.Payment.PayRepo;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;
@Repository("PayInMemory")
public class PayRepositoryImp implements PayRepo {

    private static PayRepo payRepo = null;
    private Set<Pay> pays;

    public PayRepositoryImp(){
        pays = new HashSet<>();
    }

    public static PayRepositoryImp getPayRepository(){
        if(payRepo == null){
            return new PayRepositoryImp();
        }
        return (PayRepositoryImp) payRepo;
    }
    @Override
    public Set<Pay> getAll() {
        return pays;
    }

    @Override
    public Pay create(Pay pay) {
        pays.add(pay);
        return pay;
    }

    @Override
    public Pay update(Pay pay) {
        Pay inDB = read(pay.getAmt());

        if(inDB != null){
            pays.remove(inDB);
            pays.add(pay);
            return pay;
        }

        return null;
    }

    @Override
    public void delete(String id) {
        Pay inDB= read(id);
        pays.remove(inDB);
    }

    @Override
    public Pay read(String id) {
        return pays.stream().filter(pay -> pay.getAmt().equals(id)).findAny().orElse(null);

    }
}