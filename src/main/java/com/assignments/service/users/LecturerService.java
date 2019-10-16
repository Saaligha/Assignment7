package za.ac.cput.service.users;

import za.ac.cput.domain.users.Lecturer;
import za.ac.cput.repository.IRepository;
import za.ac.cput.service.IService;

import java.util.Set;

public interface LecturerService extends IService<Lecturer, String> {

    Set<Lecturer> getAll();

}