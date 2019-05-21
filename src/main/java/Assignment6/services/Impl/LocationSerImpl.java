package Assignment6.services.Impl;

import Assignment6.domain.Location;
import Assignment6.repository.LocationRepo;
import Assignment6.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("LocationService")
public class LocationSerImpl implements LocationService {
    @Autowired
    @Qualifier("LocationRepo")
    private LocationRepo repository;

    public LocationSerImpl(LocationRepo repository){
        this.repository = repository;
    }

    @Override
    public Set<Location> getAll() {
        return null;
    }

    @Override
    public Location create(Location type) {
        return repository.create(type);
    }

    @Override
    public Location update(Location type) {
        return repository.update(type);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Location read(String s) {
        return repository.read(s);
    }
}
