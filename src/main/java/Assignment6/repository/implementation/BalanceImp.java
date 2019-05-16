package Assignment6.repository.implementation;

import Assignment6.domain.BalanceInquiry;
import Assignment6.repository.BalanceInqRepo;

import java.util.HashSet;
import java.util.Set;

public class BalanceImp implements BalanceInqRepo {

    private static BalanceImp repository = null;
    private Set<BalanceInquiry> balance;

    private BalanceImp(){
        this.balance = new HashSet<>();
    }

    public static BalanceInqRepo getRepository(){
        if(repository == null) repository = new BalanceImp();
        return repository;
    }
    @Override
    public Set<BalanceInquiry> getAll() {
        return null;
    }

    @Override
    public BalanceInquiry create(BalanceInquiry balanceInquiry) {
        this.balance.add(balanceInquiry);
        return balanceInquiry;
    }

    @Override
    public BalanceInquiry update(BalanceInquiry balanceInquiry) {
        this.balance.add(balanceInquiry);
        return balanceInquiry;
    }

    @Override
    public void delete(String s) {

    }


    public void delete(BalanceInquiry balanceInquiry) {
        this.balance.remove(balanceInquiry);


    }

    @Override
    public BalanceInquiry read(String s) {
        return null;
    }
}
