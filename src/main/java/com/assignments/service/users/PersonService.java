package za.ac.cput.service.users;

import za.ac.cput.domain.users.Person;
import za.ac.cput.repository.IRepository;
import za.ac.cput.service.IService;

import java.util.Set;

public interface PersonService extends IService<Person, String> {

    Set<Person> getAll();

}