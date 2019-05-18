package Assignment6.repository.implementation;

import Assignment6.domain.Course;
import Assignment6.domain.LogIn;
import Assignment6.domain.Transaction;
import Assignment6.repository.LogInRepo;
import Assignment6.repository.TransactionRepo;
import sun.rmi.runtime.Log;

import java.util.HashSet;
import java.util.Set;

public class LogInImp implements LogInRepo {

private static LogInImp repository = null;
private Set<LogIn> login;

private LogInImp(){
    this.login = new HashSet<>();

}

public static LogInRepo getRepository(){
    if(repository == null) repository = new LogInImp();
    return repository;
}
    @Override
    public Set<LogIn> getAll() {
        return null;
    }

    @Override
    public LogIn create(LogIn logIn) {
        this.login.add(logIn);
        return logIn;
    }

    @Override
    public LogIn update(LogIn logIn) {
         this.login.add(logIn);
        return logIn;
    }

    @Override
    public void delete(String s) {

        for(LogIn l: login)
        {
            if(l.getUserId().equals(s))
            {
                this.login.remove(l);
            }
        }
    }

    @Override
    public LogIn read(String s) {
        LogIn l = null;
        for(LogIn lang : login){
            if(lang.getUserId().equals(s)){
                System.out.println((lang.getUserId())+ lang.getPassword());
            }
        }
        return l;
    }
}
