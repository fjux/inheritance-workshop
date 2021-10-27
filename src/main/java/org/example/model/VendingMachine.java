package org.example.model;

public interface VendingMachine {
    void addCurrency(double amount);
    int getBalance();
    Product request(int id);
    int endSession();
    String getDescription(int id);
    String[] getProducts();
}
