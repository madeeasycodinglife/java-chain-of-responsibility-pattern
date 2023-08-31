package com.madeeasy;

public interface PurchaseHandler {
    void setNextHandler(PurchaseHandler handler);
    void processRequest(PurchaseRequest request);
}
