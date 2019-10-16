package za.ac.cput.service.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Demographic;
import za.ac.cput.repository.users.DemographicRepository;
import za.ac.cput.repository.users.impl.DemographicRepositoryImpl;
import za.ac.cput.service.users.DemographicService;

import java.util.Set;

@Repository("VenueServiceImpl")
public class DemographicServiceImpl implements DemographicService {

    private DemographicServiceImpl service = null;
    private DemographicRepository repository;

    public DemographicServiceImpl() {
        repository = DemographicRepositoryImpl.getRepository();
    }

    public DemographicServiceImpl getService(){

        if(service == null){
            return new DemographicServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Demographic> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Demographic create(Demographic demographic) {
        return repository.create(demographic);
    }

    @Override
    public Demographic read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Demographic update(Demographic demographic) {
        return repository.update(demographic);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }



}

