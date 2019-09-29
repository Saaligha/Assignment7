package za.ac.cput.repository.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Student;
import za.ac.cput.repository.users.StudentRepository;

import java.util.HashSet;
import java.util.Set;

@Repository("StudentInMemory")
public class StudentRepositoryImpl implements StudentRepository {

    private static StudentRepositoryImpl repository = null;
    private Set<Student> students;

    public StudentRepositoryImpl(){
        students = new HashSet<>();
    }


    public static StudentRepositoryImpl getRepository() {

        if(repository == null){
            return new StudentRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Student create(Student student) {

        students.add(student);
        return student;
    }

    @Override
    public Student read(String id) {

        return students.stream().filter(student -> student.getUserID().equals(id)).findAny().orElse(null);
    }

    @Override
    public Student update(Student student) {

        Student inDB = read(student.getUserID());

        if(inDB != null){
            students.remove(inDB);
            students.add(student);
            return student;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        Student inDB = read(id);
        students.remove(inDB);

    }

    @Override
    public Set<Student> getAll() {
        return students;
    }

}

