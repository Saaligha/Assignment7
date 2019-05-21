package Assignment6.repository.implementation;

import Assignment6.domain.Demographic;
import Assignment6.domain.Quiz;
import Assignment6.domain.Results;
import Assignment6.repository.RepoA;
import Assignment6.repository.ResultsRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("ResultsRepo")
public class ResultsImp implements ResultsRepo {

    public static ResultsImp repository = null;
    private Map<Integer, Results> results;

    private ResultsImp(){
        this.results = new HashMap<>();
    }
    @Override
    public Set<Results> getAll() {
        Collection<Results> courses = this.results.values();
        Set<Results> set = new HashSet<>();
        set.addAll(courses);
        return set;
    }

    public static ResultsImp getRepository(){
        if(repository==null)
            repository = new ResultsImp();
        return repository;
    }

    @Override
    public Results create(Results results) {
        this.results.put(results.getFinalResults(), results);
        return results;
    }

    @Override
    public Results update(Results results) {

        this.results.replace(results.getFinalResults(), results);
        return results;
    }

    @Override
    public void delete(String s) {
     this.results.remove(s);
    }

    @Override
    public Results read(final String s) {
    return this.results.get(s);

    }


}
