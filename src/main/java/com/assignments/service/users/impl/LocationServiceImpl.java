package za.ac.cput.service.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Location;
import za.ac.cput.repository.users.UniversityRepository;
import za.ac.cput.service.users.SubjectService;
import za.ac.cput.service.users.LocationService;

import java.util.Set;

@Repository("UniversityServiceImpl")
public class LocationServiceImpl implements LocationService {

    private LocationServiceImpl service = null;
    private UniversityRepository repository;

    public LocationServiceImpl() {
        repository = SubjectService.LocationRepositoryImpl.getRepository();
    }

    public LocationServiceImpl getService(){

        if(service == null){
            return new LocationServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Location> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Location create(Location location) {
        return repository.create(location);
    }

    @Override
    public Location read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Location update(Location location) {
        return repository.update(location);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }



}

