package org.example;

import org.example.model.Armor;
import org.example.model.Product;
import org.example.model.Weapon;
import org.example.model.Jewelery;
import org.example.service.VendingMachine;
import org.example.service.VendingMachineImpl;

public class App 
{
    public static void main( String[] args ) {
        Product[] products = {
                new Weapon(1, "Stick", 5, "An ordinary stick", "1 hand"),
                new Weapon(2, "Hatchet", 10, "A hatchet for butchers", "1 hand"),
                new Weapon(3, "Claymore", 25, "A claymore for hitting orcs", "2 hands"),
                new Armor(4, "Leather armor", 10, "A leather armor for fledgling adventurers", "S"),
                new Armor(5, "Leather armor", 10, "A leather armor for fledgling adventurers", "M"),
                new Armor(6, "Leather armor", 10, "A leather armor for fledgling adventurers", "L"),
                new Jewelery(7, "Ring for magical defense", 50, "With this magic can't destroy your items", "Magical defense"),
                new Jewelery(8, "Necklace of fire protection", 75, "Protects you from burning up", "Protects against fire"),
                new Jewelery(9, "Necklace of Haxxor", 100, "Makes Wally's Vending Machines Incorporated accountable for all damage inflicted on bought products", "Protects against repair costs")};

        VendingMachine waj = new VendingMachineImpl(products);

        for(String string : waj.getProducts()){
            System.out.println(string);
            System.out.println("-----");
        }

        waj.addCurrency(1000);

        System.out.println(waj.getBalance());


    }
}
