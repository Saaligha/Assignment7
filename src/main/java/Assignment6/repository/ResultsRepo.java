package Assignment6.repository;

import Assignment6.domain.Course;
import Assignment6.domain.Results;

import java.util.Set;

public interface ResultsRepo extends RepoA<Course, String> {
    Set<Results> getAll();
}

