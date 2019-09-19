package Assignment6.repository.Payment.Impl;

import Assignment6.domain.Payment.Pay;
import Assignment6.repository.Payment.PayRepo;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository("PayRepo")
public class PayImp implements PayRepo {

    public static PayImp repository = null;
    private Set<Pay> pay;
    @Override
    public Set<Pay> getAll() {
        return null;
    }

    @Override
    public Pay create(Pay pay) {
        this.pay.add(pay);
        return pay;
    }

    @Override
    public Pay update(Pay pay) {
        this.pay.add(pay);
        return pay;
    }

    @Override
    public void delete(String s) {
      this.pay.remove(pay);
    }

    @Override
    public Pay read(String s) {
        return null;
    }
}