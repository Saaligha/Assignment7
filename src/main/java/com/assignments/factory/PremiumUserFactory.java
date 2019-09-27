package com.assignments.factory;

import com.assignments.domain.PremiumUser;

public class PremiumUserFactory {

    public static PremiumUser getPremiumUser(String userId, String userName, String userSName){
        return new PremiumUser.Builder().userId(userId).userName(userName).userSname(userSName).build();
    }
}
