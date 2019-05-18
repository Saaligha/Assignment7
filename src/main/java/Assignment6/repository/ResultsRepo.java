package Assignment6.repository;

import Assignment6.domain.Course;
import Assignment6.domain.Results;

import java.util.Set;

public interface ResultsRepo extends RepoA<Results, String> {
    Set<Results> getAll();
}

