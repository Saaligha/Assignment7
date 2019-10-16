package za.ac.cput.repository.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Demographic;
import za.ac.cput.repository.users.DemographicRepository;

import java.util.HashSet;
import java.util.Set;

@Repository("VenueInMemory")
public class DemographicRepositoryImpl implements DemographicRepository {

    private static DemographicRepositoryImpl repository = null;
    private Set<Demographic> demographics;

    public DemographicRepositoryImpl(){
        demographics = new HashSet<>();
    }


    public static DemographicRepositoryImpl getRepository() {

        if(repository == null){
            return new DemographicRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Demographic create(Demographic demographic) {

        demographics.add(demographic);
        return demographic;
    }

    @Override
    public Demographic read(String id) {

        return demographics.stream().filter(venue -> venue.getVenueID().equals(id)).findAny().orElse(null);
    }

    @Override
    public Demographic update(Demographic demographic) {

        Demographic inDB = read(demographic.getVenueID());

        if(inDB != null){
            demographics.remove(inDB);
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
    public Set<Demographic> getAll() {
        return demographics;
    }

}

