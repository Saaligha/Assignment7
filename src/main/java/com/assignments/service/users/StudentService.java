package za.ac.cput.service.users;

import za.ac.cput.domain.users.Student;
import za.ac.cput.repository.IRepository;
import za.ac.cput.service.IService;

import java.util.Set;

public interface StudentService extends IService<Student, String> {

    Set<Student> getAll();

}