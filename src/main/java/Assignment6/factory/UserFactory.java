package Assignment6.factory;

import Assignment6.domain.GenerateId;
import Assignment6.domain.User;

public class UserFactory {

    public static User getUser(String userName,String userSname){
        return new User.Builder().UserId(GenerateId.generateId())
                .UserName(userName)
                .UserSname(userSname)
                .build();
    }

}
