package com.madeeasy;

public class CEOHandler implements PurchaseHandler{
    @Override
    public void setNextHandler(PurchaseHandler handler) {
        // CEO is the last handler, no next handler needed
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("CEO approves purchase request for $" + request.getAmount());
    }
}
