package Assignment6.repository.Demographic.Impl;

import Assignment6.domain.Demographic.Location;
import Assignment6.repository.Demographic.LocationRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("LocationImp")
public class LocationImp implements LocationRepo {

    private static LocationImp repository = null;
    private Map<String, Location> loc;

    private LocationImp(){
        this.loc = new HashMap<>();
    }

    public static LocationImp getRepo(){
        if(repository == null) repository = new LocationImp();
        return repository;
    }

    @Override
    public Set<Location> getAll() {
        Collection<Location> courses = this.loc.values();
        Set<Location> set = new HashSet<>();
        set.addAll(courses);
        return set;

    }

    @Override
    public Location create(Location location) {
        this.loc.put(location.getRegion(), location);
        return location;
    }

    @Override
    public Location update(Location location) {
       this.loc.replace(location.getRegion(), location);
       return location;
    }

    @Override
    public void delete(String s) {
        this.loc.remove(s);
    }

    @Override
    public Location read(final String s) {

        return this.loc.get(s);
    }

}
