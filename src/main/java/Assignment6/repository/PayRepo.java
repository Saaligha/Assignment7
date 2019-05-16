package Assignment6.repository;

import Assignment6.domain.Course;
import Assignment6.domain.Pay;

import java.util.Set;

public interface PayRepo extends RepoA<Pay, String> {
    Set<Pay> getAll();
}
