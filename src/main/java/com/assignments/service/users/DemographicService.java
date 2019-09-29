package za.ac.cput.service.users;

import za.ac.cput.domain.users.Demographic;
import za.ac.cput.service.IService;

import java.util.Set;

public interface DemographicService extends IService<Demographic, String> {

    Set<Demographic> getAll();

}