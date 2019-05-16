package Assignment6.factory;

import Assignment6.domain.LogIn;

public class LogInFactory {

    public static LogIn getPassword(String password){
        return new LogIn.Builder()
                .Password(password)
                .build();
    }
}
