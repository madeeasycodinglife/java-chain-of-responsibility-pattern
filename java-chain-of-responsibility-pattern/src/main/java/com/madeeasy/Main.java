package com.madeeasy;

public class Main {
    public static void main(String[] args) {
        PurchaseHandler manager = new ManagerHandler();
        PurchaseHandler director = new DirectorHandler();
        PurchaseHandler ceo = new CEOHandler();

        manager.setNextHandler(director);
        director.setNextHandler(ceo);

        PurchaseRequest request1 = new PurchaseRequest(800);
        PurchaseRequest request2 = new PurchaseRequest(3000);
        PurchaseRequest request3 = new PurchaseRequest(10000);

        manager.processRequest(request1);
        manager.processRequest(request2);
        manager.processRequest(request3);
    }
}