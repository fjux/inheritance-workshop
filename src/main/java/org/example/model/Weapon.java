package org.example.model;

public class Weapon implements Product{
    private int id;
    private String productName;
    private int price;
    private String description;
    private String grip;

    public Weapon(int id, String productName, int price, String description, String grip) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.grip = grip;
    }


    @Override
    public String examine() {
        return "{id: " + id + ", name: " + productName + ", price: " + price + ", description: " + description + ", grip: " + grip + "}";
    }

    @Override
    public String use() {
        return "Grip " + productName + " with " + grip + " and hit chosen monster! \nIf the monster is a dragon...\nRUN!";
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
