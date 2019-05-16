package Assignment6.domain;

public abstract class Transaction {

private int accountNumber;
private double accountBalance;
    
    public Transaction() {
    }
    
    public int getAccountNumber(){
    	return accountNumber;
    }
    
    public abstract void  execute();
 	
 	public double getAccBalance(){
 		return accountBalance;
 	}
 	
 	public void setAccountBalance(double aBalance){
 		accountBalance = aBalance;
 	}
}