package Assignment6.factory;

import Assignment6.domain.Pay;

public class PayFactory {
 public static Pay getPay(int pay){
     return new Pay.Builder().amt(pay).build();
 }
}
