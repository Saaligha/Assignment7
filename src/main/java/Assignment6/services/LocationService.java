package Assignment6.services;

import Assignment6.domain.Location;
import Assignment6.services.IService;

import java.util.Set;

public interface LocationService extends IService<Location,String> {
    Set<Location> getAll();
}
