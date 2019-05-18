package Assignment6.repository.implementation;

import Assignment6.domain.Demographic;
import Assignment6.domain.Pay;
import Assignment6.repository.PayRepo;
import Assignment6.repository.RepoA;

import java.util.Set;

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