package Assignment6.repository;

import Assignment6.domain.BalanceInquiry;
import Assignment6.domain.User;

import java.util.Set;

public interface BalanceInqRepo extends RepoA<BalanceInquiry, String> {
    Set<BalanceInquiry> getAll();
}
