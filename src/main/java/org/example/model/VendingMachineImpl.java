package org.example.model;

public class VendingMachineImpl implements VendingMachine{
    private int balance;
    private String[] products;

    public VendingMachineImpl(int balance, String[] products) {
        this.balance = balance;
        this.products = products;
    }

    @Override
    public void addCurrency(double amount) {

    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public Product request(int id) {
        return ;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int id) {
        return null;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
