package Assignment6.domain;

public class BalanceInquiry extends Transaction {

    public BalanceInquiry() {
    }
    
    public void execute(){
    	
    	System.out.println("Balance is:" +getAccBalance());
    }
    
    
}