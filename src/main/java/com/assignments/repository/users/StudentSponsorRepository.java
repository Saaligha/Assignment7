package za.ac.cput.repository.users;

import za.ac.cput.domain.users.StudentSponsor;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface StudentSponsorRepository extends IRepository<StudentSponsor, String> {

    Set<StudentSponsor> getAll();

}