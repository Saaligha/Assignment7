package za.ac.cput.repository.users;

import za.ac.cput.domain.users.Location;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface UniversityRepository extends IRepository<Location, String> {

    Set<Location> getAll();

}