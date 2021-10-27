package org.example.service;

import org.example.model.Product;

public class VendingMachineImpl implements VendingMachine {
    private int balance;
    private Product[] products;
    public static final int[] VALID_DENOMINATIONS = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }





    @Override
    public void addCurrency(int amount) {
        for( int validDenomination : VALID_DENOMINATIONS){
            if(validDenomination == amount){
                balance += amount;
            }
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public Product request(int id) {
        for(Product product : products){
            if(product.getId() == id){
                if(product.getPrice() <= balance){
                    balance = (int) (balance - product.getPrice());
                    return product;
                }else{
                    throw new RuntimeException("Product " + product.getProductName() + " is too expensive");
                }
            }
        }
        throw new RuntimeException("Could not find product with id " + id);
    }

    @Override
    public int endSession() {
        int temp = balance;
        balance = 0;
        return temp;
    }

    @Override
    public String getDescription(int id) {
        String notFound ="Could not find product with id " + id;
        for(Product product : products){
            if(product.getId() == id){
                return product.examine();
            }
        }
        return notFound;
    }

    @Override
    public String[] getProducts() {
        String[] productAsString = new String[products.length];
        for(int i=0; i< products.length; i++){
            productAsString[i] = products[i].examine();
        }
        return productAsString;
    }
}
