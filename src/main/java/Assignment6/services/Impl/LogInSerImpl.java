package Assignment6.services.Impl;

import Assignment6.domain.Course;
import Assignment6.domain.LogIn;
import Assignment6.repository.LogInRepo;
import Assignment6.services.LogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("LogInImpl")
public class LogInSerImpl implements LogInService {
    @Autowired
    @Qualifier("LogInRepo")
    private LogInRepo repository;

    public LogInSerImpl(LogInRepo repository){
        this.repository = repository;

    }

    @Override
    public Set<LogIn> getAll() {
        return null;
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
