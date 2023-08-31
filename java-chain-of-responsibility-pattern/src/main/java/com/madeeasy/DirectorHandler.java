package com.madeeasy;

public class DirectorHandler implements PurchaseHandler{
    private PurchaseHandler nextHandler;

    @Override
    public void setNextHandler(PurchaseHandler handler) {
        nextHandler = handler;
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("Director approves purchase request for $" + request.getAmount());
        } else if (nextHandler != null) {
            nextHandler.processRequest(request);
        }
    }
}
