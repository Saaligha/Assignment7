package Assignment6.factory.Payment;

import Assignment6.domain.Payment.Pay;

public class PayFactory {
 public static Pay getPay(String pay){
     return new Pay.Builder().amt(pay).build();
 }
}
