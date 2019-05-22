package Assignment6.repository.implementation;

import Assignment6.domain.Demographic;
import Assignment6.repository.DemographicRepo;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository("DemographicImp")
public class DemographicImp implements DemographicRepo {


    private static DemographicImp repository = null;
    private Map<String ,Demographic> demo;

    private DemographicImp() {
        this.demo = new HashMap<>();
    }

    public static DemographicImp getRepo(){
        if(repository == null) repository = new DemographicImp();
        return repository;
    }
    @Override
    public Set<Demographic> getAll() {

        Collection<Demographic> demo = this.demo.values();
        Set<Demographic> set = new HashSet<>();
        set.addAll(demo);


        return set;
    }

    @Override
    public Demographic create(Demographic demographic) {
        this.demo.put(demographic.getGender(), demographic);
        return demographic;
    }

    @Override
    public Demographic update(Demographic demographic) {
        this.demo.replace(demographic.getGender(), demographic);
        return demographic;
    }

    @Override
    public void delete(String demographic) {
        this.demo.remove(demographic);

    }

    @Override
    public Demographic read(String gender){
        return  this.demo.get(gender);

    } 
       




}
