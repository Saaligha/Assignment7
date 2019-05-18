package Assignment6.repository.implementation;

import Assignment6.domain.Demographic;
import Assignment6.domain.Quiz;
import Assignment6.domain.Results;
import Assignment6.repository.RepoA;
import Assignment6.repository.ResultsRepo;

import java.util.Set;

public class ResultsImp implements ResultsRepo {

    public static ResultsImp repository = null;
    private Set<Results> results;
    @Override
    public Set<Results> getAll() {
        return null;
    }
    public ResultsRepo getRepository(){
        if(repository==null)
            repository = new ResultsImp();
        return repository;
    }

    @Override
    public Results create(Results results) {
        this.results.add(results);
        return results;
    }

    @Override
    public Results update(Results results) {

        this.results.add(results);
        return results;
    }

    @Override
    public void delete(String s) {

        for(Results l: results)
        {
            if(l.getFinalResults()==50)
            {
                this.results.remove(l);
            }
        }
    }

    @Override
    public Results read(String s) {
        Results l = null;
        for(Results lang : results){
            if(lang.getFinalResults() == 50){
                System.out.println((lang.getFinalResults()));
            }
        }
        return l;
    }
}
