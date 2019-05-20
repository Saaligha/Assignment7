package Assignment6.services;

import Assignment6.domain.Results;

import java.util.Set;

public interface ResultsServices extends IService<Results, String> {
    Set<Results> getAll();
}
