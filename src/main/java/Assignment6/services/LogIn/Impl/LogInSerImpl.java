package Assignment6.services.LogIn.Impl;

import Assignment6.domain.LogIn.LogIn;
import Assignment6.repository.LogIn.Impl.LogInImp;
import Assignment6.repository.LogIn.LogInRepo;
import Assignment6.services.LogIn.LogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("LogInServiceImpl")
public class LogInSerImpl implements LogInService {
   private LogInSerImpl service = null;
    private LogInRepo repository;

    public LogInSerImpl(){
        this.repository = LogInImp.getRepository();

    }
    public LogInSerImpl getService(){
        if (service == null){
            service = new LogInSerImpl();
        }
        return service;
    }


    @Override
    public Set<LogIn> getAll() {
        return this.repository.getAll();
    }

    @Override
    public LogIn create(LogIn type) {
        return repository.create(type);
    }

    @Override
    public LogIn update(LogIn type) {
        return this.repository.update(type);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public LogIn read(String s) {
        return repository.read(s);
    }
}
