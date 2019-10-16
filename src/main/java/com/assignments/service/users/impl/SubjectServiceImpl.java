package za.ac.cput.service.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Subject;
import za.ac.cput.repository.users.SubjectRepository;
import za.ac.cput.repository.users.impl.SubjectRepositoryImpl;
import za.ac.cput.service.users.SubjectService;

import java.util.HashSet;
import java.util.Set;

@Repository("SubjectServiceImpl")
public class SubjectServiceImpl implements SubjectService {

    private SubjectServiceImpl service = null;
    private SubjectRepository repository;

    public SubjectServiceImpl() {
        repository = SubjectRepositoryImpl.getRepository();
    }

    public SubjectServiceImpl getService(){

        if(service == null){
            return new SubjectServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Subject> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Subject create(Subject subject) {
        return repository.create(subject);
    }

    @Override
    public Subject read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Subject update(Subject subject) {
        return repository.update(subject);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }



}

