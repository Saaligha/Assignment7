package Assignment6.repository;

import Assignment6.domain.Course;
import Assignment6.domain.Demographic;

import java.util.Set;

public interface DemographicRepo extends RepoA<Demographic, String> {
    Set<Demographic> getAll();

}
