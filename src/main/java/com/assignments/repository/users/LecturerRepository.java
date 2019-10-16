package za.ac.cput.repository.users;

import za.ac.cput.domain.users.Lecturer;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface LecturerRepository extends IRepository<Lecturer, String> {

    Set<Lecturer> getAll();

}