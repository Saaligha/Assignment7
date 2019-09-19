package Assignment6.factory;

import Assignment6.domain.Subscription;

public class SubscriptionFactory {

    public static Subscription sub(String type){
        return new Subscription.Builder().subType(type).build();
    }
}
