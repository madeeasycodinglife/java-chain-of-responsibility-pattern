package com.madeeasy;

public class ManagerHandler implements PurchaseHandler{
    private PurchaseHandler nextHandler;

    @Override
    public void setNextHandler(PurchaseHandler handler) {
        nextHandler = handler;
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 1000) {
            System.out.println("Manager approves purchase request for $" + request.getAmount());
        } else if (nextHandler != null) {
            nextHandler.processRequest(request);
        }
    }
}
