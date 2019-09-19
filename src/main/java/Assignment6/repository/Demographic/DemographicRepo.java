package Assignment6.repository.Demographic;

import Assignment6.domain.Demographic.Demographic;
import Assignment6.repository.RepoA;

import java.util.Set;

public interface DemographicRepo extends RepoA<Demographic, String> {
    Set<Demographic> getAll();

}
