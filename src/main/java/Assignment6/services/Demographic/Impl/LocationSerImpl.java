package Assignment6.services.Demographic.Impl;

import Assignment6.domain.Demographic.Location;
import Assignment6.repository.Demographic.Impl.LocationImp;
import Assignment6.repository.Demographic.LocationRepo;
import Assignment6.services.Demographic.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("LocationSerImp")
public class LocationSerImpl implements LocationService {
   private LocationSerImpl service = null;
    private LocationRepo repository;

    public LocationSerImpl(LocationRepo repository){
        this.repository = LocationImp.getRepo();
    }

    @Override
    public Set<Location> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Location create(Location type) {
        return this.repository.create(type);
    }

    @Override
    public Location update(Location type) {
        return this.repository.update(type);
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
