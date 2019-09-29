package za.ac.cput.service.users;

import za.ac.cput.domain.users.Administrator;
import za.ac.cput.repository.IRepository;
import za.ac.cput.service.IService;

import java.util.Set;

public interface AdministratorService extends IService<Administrator, String> {

    Set<Administrator> getAll();

}