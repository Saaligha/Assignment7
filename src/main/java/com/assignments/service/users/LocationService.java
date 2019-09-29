package za.ac.cput.service.users;

import za.ac.cput.domain.users.Location;
import za.ac.cput.service.IService;

import java.util.Set;

public interface LocationService extends IService<Location, String> {

    Set<Location> getAll();

}