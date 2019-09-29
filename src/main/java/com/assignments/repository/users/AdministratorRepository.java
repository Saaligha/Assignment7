package za.ac.cput.repository.users;

import za.ac.cput.domain.users.Administrator;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface AdministratorRepository extends IRepository<Administrator, String> {

    Set<Administrator> getAll();

}