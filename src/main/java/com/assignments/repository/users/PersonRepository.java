package za.ac.cput.repository.users;

import za.ac.cput.domain.users.Person;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface PersonRepository extends IRepository<Person, String> {

    Set<Person> getAll();

}