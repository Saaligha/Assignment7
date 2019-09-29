package za.ac.cput.service.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.StudentSponsor;
import za.ac.cput.repository.users.StudentSponsorRepository;
import za.ac.cput.repository.users.impl.StudentSponsorRepositoryImpl;
import za.ac.cput.service.users.StudentSponsorService;

import java.util.HashSet;
import java.util.Set;

@Repository("StudentSponsorServiceImpl")
public class StudentSponsorServiceImpl implements StudentSponsorService {

    private StudentSponsorServiceImpl service = null;
    private StudentSponsorRepository repository;

    public StudentSponsorServiceImpl() {
        repository = StudentSponsorRepositoryImpl.getRepository();
    }

    public StudentSponsorServiceImpl getService(){

        if(service == null){
            return new StudentSponsorServiceImpl();
        }
        return service;
    }

    @Override
    public Set<StudentSponsor> getAll() {
        return this.repository.getAll();
    }

    @Override
    public StudentSponsor create(StudentSponsor studentSponsor) {
        return repository.create(studentSponsor);
    }

    @Override
    public StudentSponsor read(String integer) {
        return repository.read(integer);
    }

    @Override
    public StudentSponsor update(StudentSponsor studentSponsor) {
        return repository.update(studentSponsor);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }



}

