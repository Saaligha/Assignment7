package com.assignments.repository.impl;

import com.assignments.domain.Demographic;
import com.assignments.repository.DemographicRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("DemographicInMemory")
public class DemographicRepositoryImp implements DemographicRepository {

    private static DemographicRepositoryImp demographicRepo = null;
    private Set<Demographic> demographics;

    public DemographicRepositoryImp(){
        demographics = new HashSet<>();
    }

    public static DemographicRepositoryImp getDemographicRepo(){
        if(demographicRepo == null){
            return demographicRepo;
        }

        return (DemographicRepositoryImp) demographicRepo;
    }

    @Override
    public Set<Demographic> getAll() {
        return demographics;
    }

    @Override
    public Demographic create(Demographic demographic) {
    demographics.add(demographic);
    return demographic;
    }

    @Override
    public Demographic update(Demographic demographic) {
        Demographic inDB = read(demographic.getGender());

        if(inDB != null){
            demographics.remove(demographic);
            demographics.add(demographic);
            return demographic;
        }
        return null;
    }

    @Override
    public void delete(String id) {
     Demographic inDB = read(id);
     demographics.remove(inDB);
    }

    @Override
    public Demographic read(String demographic) {
        return demographics.stream().filter(demographic1 -> demographic1.getGender().equals(demographic)).findAny().orElse(null);
    }
}
