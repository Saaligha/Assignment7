package Assignment6.repository.implementation;

import Assignment6.domain.LogIn;
import Assignment6.repository.LogInRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("LogInRepo")
public class LogInImp implements LogInRepo {

private static LogInImp repository = null;
private Map<String, LogIn> login;

private LogInImp(){
    this.login = new HashMap<>();

}

public static LogInImp getRepository(){
    if(repository == null) repository = new LogInImp();
    return repository;
}
    @Override
    public Set<LogIn> getAll() {
        Collection<LogIn> courses = this.login.values();
        Set<LogIn> set = new HashSet<>();
        set.addAll(courses);
        return set;
    }

    @Override
    public LogIn create(LogIn logIn) {
        this.login.put(logIn.getUserId(), logIn);
        return logIn;
    }

    @Override
    public LogIn update(LogIn logIn) {
         this.login.replace(logIn.getUserId(), logIn);
        return logIn;
    }

    @Override
    public void delete(String s) {

      this.login.remove(s);
    }

    @Override
    public LogIn read(String s) {
        return   this.login.get(s);

    }
}
