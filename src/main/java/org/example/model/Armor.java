package org.example.model;

public class Armor implements Product{
    private int id;
    private String productName;
    private int price;
    private String description;
    private String size;

    public Armor(int id, String productName, int price, String description, String size) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.size = size;
    }

    @Override
    public String examine() {
        return "{id: " + id + ", name: " + productName + ", price: " + price + ", description: " + description + ", size: " + size + "}";
    }

    @Override
    public String use() {
        return "Make sure " + productName + " has your size (" + size + ") and equip piece of armor! \nIf the damage type is a magical...\nWally's Vending Machines Incorporated (TM) can't be held responsible for function of bought product";
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }
}
