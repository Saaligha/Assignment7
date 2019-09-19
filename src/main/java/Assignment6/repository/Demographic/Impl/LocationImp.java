package Assignment6.repository.Demographic.Impl;

import Assignment6.domain.Demographic.Location;
import Assignment6.repository.Demographic.LocationRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("LocationInMemory")
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
        return loc;
    }

    @Override
    public Location create(Location location) {
        loc.add(location);
        return location;
    }

    @Override
    public Location update(Location location) {

        Location inDB = read(location.getRegion());

        if(inDB != null){
            loc.remove(inDB);
            loc.add(location);
            return location;
        }
        return null;
    }

    @Override
    public void delete(String id) {
    Location inDB = read(id);
    loc.remove(inDB);
    }

    @Override
    public Location read(String s) {
        return loc.stream().filter(location -> location.getRegion().equals(s)).findAny().orElse(null);

    }
}
