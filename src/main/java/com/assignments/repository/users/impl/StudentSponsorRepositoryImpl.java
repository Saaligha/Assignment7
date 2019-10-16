package za.ac.cput.repository.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.StudentSponsor;
import za.ac.cput.repository.users.StudentSponsorRepository;

import java.util.HashSet;
import java.util.Set;

@Repository("StudentSponsorInMemory")
public class StudentSponsorRepositoryImpl implements StudentSponsorRepository {

    private static StudentSponsorRepositoryImpl repository = null;
    private Set<StudentSponsor> studentSponsors;

    public StudentSponsorRepositoryImpl(){
        studentSponsors = new HashSet<>();
    }


    public static StudentSponsorRepositoryImpl getRepository() {

        if(repository == null){
            return new StudentSponsorRepositoryImpl();
        }
        return repository;
    }

    @Override
    public StudentSponsor create(StudentSponsor studentSponsor) {

        studentSponsors.add(studentSponsor);
        return studentSponsor;
    }

    @Override
    public StudentSponsor read(String id) {

        return studentSponsors.stream().filter(studentSponsor -> studentSponsor.getUserID().equals(id)).findAny().orElse(null);
    }

    @Override
    public StudentSponsor update(StudentSponsor studentSponsor) {

        StudentSponsor inDB = read(studentSponsor.getUserID());

        if(inDB != null){
            studentSponsors.remove(inDB);
            studentSponsors.add(studentSponsor);
            return studentSponsor;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        StudentSponsor inDB = read(id);
        studentSponsors.remove(inDB);

    }

    @Override
    public Set<StudentSponsor> getAll() {
        return studentSponsors;
    }

}

