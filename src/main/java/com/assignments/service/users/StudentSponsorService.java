package za.ac.cput.service.users;

import za.ac.cput.domain.users.StudentSponsor;
import za.ac.cput.repository.IRepository;
import za.ac.cput.service.IService;

import java.util.Set;

public interface StudentSponsorService extends IService<StudentSponsor, String> {

    Set<StudentSponsor> getAll();

}