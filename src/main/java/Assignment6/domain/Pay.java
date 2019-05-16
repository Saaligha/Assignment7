package Assignment6.domain;

public class Pay extends Transaction {

	private double  amount;
	

    public Pay() {
    }
    
    public void execute(){
    double dep;
    
    dep =	amount + getAccBalance();
    	
    	//updating acc
    	setAccountBalance(dep); 
    	
    	System.out.println("Pay: " );
    }
    
    
    
}