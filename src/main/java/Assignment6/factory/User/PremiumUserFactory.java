package Assignment6.factory.User;

import Assignment6.domain.GenerateId;
import Assignment6.domain.User.PremiumUser;

public class PremiumUserFactory {

    public static PremiumUser getPremiumUser(String userName, String userSname){
        return new PremiumUser.Builder().userId(GenerateId.generateId())
                .userName(userName)
                .userSname(userSname)
                .build();
    }
}
