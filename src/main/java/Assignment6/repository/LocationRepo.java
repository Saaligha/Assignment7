package Assignment6.repository;

import Assignment6.domain.Course;
import Assignment6.domain.Location;

import java.util.Set;

public interface LocationRepo extends RepoA<Location, String> {
    Set<Location> getAll();
}