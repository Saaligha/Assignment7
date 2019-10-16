package za.ac.cput.repository.users;

import za.ac.cput.domain.users.Subject;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface SubjectRepository extends IRepository<Subject, String> {

    Set<Subject> getAll();

}