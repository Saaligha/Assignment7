package Assignment6.factory.Payment;

import Assignment6.domain.Payment.Subscription;

public class SubscriptionFactory {

    public static Subscription getSubscription(String type){
        return new Subscription.Builder().subType(type).build();
    }
}
