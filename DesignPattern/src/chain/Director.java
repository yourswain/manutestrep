package chain;

class Director extends PurchasePower {
    private final double ALLOWABLE = 20 * base;

    public void processRequest(PurchaseRequest request ) {
        if( request.getAmount() < ALLOWABLE )
            System.out.println("Director will approve $"+ request.getAmount());
        else
           if( successor != null)
               successor.processRequest(request);
  }
}