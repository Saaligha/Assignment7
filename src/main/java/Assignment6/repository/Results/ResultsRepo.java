package Assignment6.repository.Results;

import Assignment6.domain.Results.Results;
import Assignment6.repository.RepoA;

import java.util.Set;

public interface ResultsRepo extends RepoA<Results, String> {
    Set<Results> getAll();
}

