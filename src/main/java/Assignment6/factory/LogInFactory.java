package Assignment6.factory;

import Assignment6.domain.LogIn;

public class LogInFactory {

    public static LogIn getPassword(String password, String id){
        return new LogIn.Builder()
                .UserId(id)
                .Password(password)
                .build();
    }
}
