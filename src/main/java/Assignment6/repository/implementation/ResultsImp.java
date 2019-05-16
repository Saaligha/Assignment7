package Assignment6.repository.implementation;

import Assignment6.domain.Demographic;
import Assignment6.domain.Quiz;
import Assignment6.domain.Results;
import Assignment6.repository.RepoA;

import java.util.Set;

public abstract class ResultsImp implements RepoA {
    abstract Set<Results> getAll();
}
