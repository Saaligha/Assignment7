package za.ac.cput.repository.users;

import za.ac.cput.domain.users.Demographic;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface DemographicRepository extends IRepository<Demographic, String> {

    Set<Demographic> getAll();

}