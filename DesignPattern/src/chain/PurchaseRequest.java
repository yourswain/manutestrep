package chain;

class PurchaseRequest {
	  
   
    private double amount;
    

    public PurchaseRequest(double amount){
     
        this.amount = amount;
      
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amt){
        amount = amt;
    }
    
   
}