package Assignment6.repository.LogIn.Impl;

import Assignment6.domain.LogIn.LogIn;
import Assignment6.repository.LogIn.LogInRepo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("LogInInMemory")
public class LogInImp implements LogInRepo {

private static LogInImp repository = null;
private Set<LogIn> login;

private LogInImp(){
    this.login = new HashSet<>();
}

public static LogInImp getRepository(){
    if(repository == null) repository = new LogInImp();
    return repository;
}

    @Override
    public Set<LogIn> getAll() {
        return login;
    }

    @Override
    public LogIn create(LogIn logIn) {
    login.add(logIn);
    return logIn;
    }

    @Override
    public LogIn update(LogIn logIn) {
        LogIn inDB = read(logIn.getUserId());

        if (inDB != null) {
            login.remove(inDB);
            login.add(logIn);
            return logIn;
        }
        return null;
    }

    @Override
    public void delete(String id) {
    LogIn inDB = read(id);
    login.remove(inDB);

    }

    @Override
    public LogIn read(String id) {
        return login.stream().filter(log -> log.getUserId().equals(id)).findAny().orElse(null);

    }
}
