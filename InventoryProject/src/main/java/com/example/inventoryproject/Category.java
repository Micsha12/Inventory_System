package com.example.inventoryproject;
import java.util.ArrayList;

public class Category {
    String category;
    ArrayList<Product> products=new ArrayList<>();

    public Category(ArrayList<Product> x){ this.products=x; }
}
