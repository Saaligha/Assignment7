package za.ac.cput.repository.users;

import za.ac.cput.domain.users.Student;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface StudentRepository extends IRepository<Student, String> {

    Set<Student> getAll();

}