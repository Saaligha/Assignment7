package Assignment6.repository.implementation;

import Assignment6.domain.Demographic;
import Assignment6.domain.Location;
import Assignment6.repository.LocationRepo;
import Assignment6.repository.RepoA;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;
@Repository("LocationRepo")
public class LocationImp implements LocationRepo {

    private static LocationImp repository = null;
    private Set<Location> loc;

    private LocationImp(){
        this.loc = new HashSet<>();
    }

    public static LocationImp getRepo(){
        if(repository == null) repository = new LocationImp();
        return repository;
    }

    @Override
    public Set<Location> getAll() {
        return null;
    }

    @Override
    public Location create(Location location) {
        return null;
    }

    @Override
    public Location update(Location location) {
       this.loc.add(location);
       return location;
    }

    @Override
    public void delete(String s) {
        this.loc.remove(s);
    }

    @Override
    public Location read(String s) {
        return null;
    }
}
