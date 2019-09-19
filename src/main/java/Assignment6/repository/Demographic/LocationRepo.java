package Assignment6.repository.Demographic;

import Assignment6.domain.Demographic.Location;
import Assignment6.repository.RepoA;

import java.util.Set;

public interface LocationRepo extends RepoA<Location, String> {
    Set<Location> getAll();
}