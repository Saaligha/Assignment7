package Assignment6.services.Impl;

import Assignment6.domain.Course;
import Assignment6.domain.Results;
import Assignment6.repository.CourseRepo;
import Assignment6.repository.ResultsRepo;
import Assignment6.services.ResultsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ResultsSerImpl")
public class ResultsSerImpl implements ResultsServices {
    @Autowired
    @Qualifier("ResultsImp")
    private ResultsRepo repository;


    public ResultsSerImpl(ResultsRepo repository) {
        this.repository = repository;
    }


    @Override
    public Set<Results> getAll() {
        return null;
    }

    @Override
    public Results create(Results type) {
        return repository.create(type);
    }

    @Override
    public Results update(Results type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Results read(String s) {
        return repository.read(s);
    }
}
