package com.assignments.repository;

import com.assignments.domain.Demographic;

import java.util.Set;

public interface DemographicRepository extends IRepository<Demographic, String> {
    Set<Demographic> getAll();

}
