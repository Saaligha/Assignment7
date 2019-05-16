package Assignment6.factory;

import Assignment6.domain.User;

public class UserFactory {

    public static User getUser(String userId,String userName,String userSname){
        return new User.Builder().UserId(userId)
                .UserName(userName)
                .UserSname(userSname)
                .build();
    }

}
