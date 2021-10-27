package org.example.model;

public class Jewelery implements Product{
    private int id;
    private String productName;
    private int price;
    private String description;
    private String enhancement;

    public Jewelery(int id, String productName, int price, String description, String enhancement) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.enhancement = enhancement;
    }

    @Override
    public String examine() {
        return "{id: " + id + ", name: " + productName + ", price: " + price + ", description: " + description + ", enhancement: " + enhancement + "}";
    }

    @Override
    public String use() {
        return "Make sure " + productName + " has applicable enhancement " + enhancement + " and equip for further defense \nIf the enhancement is applicable to the damage type...\nCONGRATULATIONS!!!\n.\n.\n.\nYou survived!";
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
