package za.ac.cput.service.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Student;
import za.ac.cput.repository.users.StudentRepository;
import za.ac.cput.repository.users.impl.StudentRepositoryImpl;
import za.ac.cput.service.users.StudentService;

import java.util.HashSet;
import java.util.Set;

@Repository("StudentServiceImpl")
public class StudentServiceImpl implements StudentService {

    private StudentServiceImpl service = null;
    private StudentRepository repository;

    public StudentServiceImpl() {
        repository = StudentRepositoryImpl.getRepository();
    }

    public StudentServiceImpl getService(){

        if(service == null){
            return new StudentServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Student> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Student create(Student student) {
        return repository.create(student);
    }

    @Override
    public Student read(String integer) {
        return repository.read(integer);
    }

    @Override
    public Student update(Student student) {
        return repository.update(student);
    }

    @Override
    public void delete(String integer) {

        repository.delete(integer);
    }



}

