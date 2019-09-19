package Assignment6.factory.LogIn;

import Assignment6.domain.LogIn.LogIn;

public class LogInFactory {

    public static LogIn getLogIn(String password, String id){
        return new LogIn.Builder()
                .UserId(id)
                .Password(password)
                .build();
    }
}
