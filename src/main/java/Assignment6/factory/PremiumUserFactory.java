package Assignment6.factory;

import Assignment6.domain.GenerateId;
import Assignment6.domain.PremiumUser;

public class PremiumUserFactory {

    public static PremiumUser getPremiumUser(String userName, String userSname){
        return new PremiumUser.Builder().userId(GenerateId.generateId())
                .userName(userName)
                .userSname(userSname)
                .build();
    }
}
