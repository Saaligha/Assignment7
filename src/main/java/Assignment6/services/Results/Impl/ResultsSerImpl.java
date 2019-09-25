package Assignment6.services.Results.Impl;

import Assignment6.domain.Results.Results;
import Assignment6.repository.Results.Impl.ResultsRepositoryImp;
import Assignment6.repository.Results.ResultsRepo;
import Assignment6.services.Results.ResultsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ResultsServiceImpl")
public class ResultsSerImpl implements ResultsServices {

    private ResultsRepo repository;
    private ResultsSerImpl service = null;

    public ResultsSerImpl()  {
        this.repository = ResultsRepositoryImp.getResultsRepository();
    }
    public ResultsSerImpl getService(){
        if(service==null){
            service=new ResultsSerImpl();
        }
        return service;
    }


    @Override
    public Set<Results> getAll() {
        return this.repository.getAll();
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
