package za.ac.cput.repository.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Lecturer;
import za.ac.cput.repository.users.LecturerRepository;

import java.util.HashSet;
import java.util.Set;

@Repository("LecturerInMemory")
public class LecturerRepositoryImpl implements LecturerRepository {

    private static LecturerRepositoryImpl repository = null;
    private Set<Lecturer> lecturers;

    public LecturerRepositoryImpl(){
        lecturers = new HashSet<>();
    }


    public static LecturerRepositoryImpl getRepository() {

        if(repository == null){
            return new LecturerRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Lecturer create(Lecturer lecturer) {

        lecturers.add(lecturer);
        return lecturer;
    }

    @Override
    public Lecturer read(String id) {

        return lecturers.stream().filter(lecturer -> lecturer.getUserID().equals(id)).findAny().orElse(null);
    }

    @Override
    public Lecturer update(Lecturer lecturer) {

        Lecturer inDB = read(lecturer.getUserID());

        if(inDB != null){
            lecturers.remove(inDB);
            lecturers.add(lecturer);
            return lecturer;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        Lecturer inDB = read(id);
        lecturers.remove(inDB);

    }

    @Override
    public Set<Lecturer> getAll() {
        return lecturers;
    }

}

