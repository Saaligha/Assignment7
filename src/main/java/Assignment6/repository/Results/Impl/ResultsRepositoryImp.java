package Assignment6.repository.Results.Impl;

import Assignment6.domain.Results.Results;
import Assignment6.repository.Results.ResultsRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("ResultsInMemory")
public class ResultsRepositoryImp implements ResultsRepo {

    private static ResultsRepositoryImp resultsRepository = null;
    private Set<Results> result;

    public ResultsRepositoryImp(){
        result = new HashSet<>();
    }

    public static ResultsRepositoryImp getResultsRepository(){
        if(resultsRepository == null){
            return new ResultsRepositoryImp();
        }
        return resultsRepository;
    }

    @Override
    public Set<Results> getAll() {
        return result;
    }

    @Override
    public Results create(Results results) {
        result.add(results);
        return results;
    }

    @Override
    public Results update(Results results) {

        Results inDB = read(results.getSemesterResults());

        if(inDB != null){
            result.remove(inDB);
            result.add(results);
            return results;
        }

        return null;
    }

    @Override
    public void delete(String semResults) {
    Results inDB = read(semResults);
    result.remove(inDB);
    }

    @Override
    public Results read(String semResults) {
        return result.stream().filter(results -> results.getSemesterResults().equals(semResults)).findAny().orElse(null);

    }
}
