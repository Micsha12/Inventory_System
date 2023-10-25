package com.example.inventoryproject;
import java.util.ArrayList;

public class Product {
    private String name , category , id ;
    private int price , stock;

    public Product(String name , String category  , String id , int price , int stock){
        this.name=name;
        this.category=category;
        this.id=id;
        this.price=price;
        this.stock=stock;
    }
    public String getName(){
        return this.name;
    }public String getCategory() {
        return this.category;
    }
    public String getId() {
        return this.id;
    }
}
