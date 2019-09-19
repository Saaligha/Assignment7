package Assignment6.repository.Demographic.Impl;

import Assignment6.domain.Demographic.Demographic;
import Assignment6.repository.Demographic.DemographicRepo;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository("DemographicInMemory")
public class DemographicImp implements DemographicRepo {

    private static DemographicImp demographicRepo = null;
    private Set<Demographic> demographics;

    public DemographicImp(){
        demographics = new HashSet<>();
    }

    public static DemographicImp getDemographicRepo(){
        if(demographicRepo == null){
            return demographicRepo;
        }

        return (DemographicImp) demographicRepo;
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
