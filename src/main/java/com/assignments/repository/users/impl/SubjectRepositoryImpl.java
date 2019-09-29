package za.ac.cput.repository.users.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Subject;
import za.ac.cput.repository.users.SubjectRepository;

import java.util.HashSet;
import java.util.Set;

@Repository("SubjectInMemory")
public class SubjectRepositoryImpl implements SubjectRepository {

    private static SubjectRepositoryImpl repository = null;
    private Set<Subject> subjects;

    public SubjectRepositoryImpl(){
        subjects = new HashSet<>();
    }


    public static SubjectRepositoryImpl getRepository() {

        if(repository == null){
            return new SubjectRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Subject create(Subject subject) {

        subjects.add(subject);
        return subject;
    }

    @Override
    public Subject read(String id) {

        return subjects.stream().filter(subject -> subject.getSubjectID().equals(id)).findAny().orElse(null);
    }

    @Override
    public Subject update(Subject subject) {

        Subject inDB = read(subject.getSubjectID());

        if(inDB != null){
            subjects.remove(inDB);
            subjects.add(subject);
            return subject;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        Subject inDB = read(id);
        subjects.remove(inDB);

    }

    @Override
    public Set<Subject> getAll() {
        return subjects;
    }

}

