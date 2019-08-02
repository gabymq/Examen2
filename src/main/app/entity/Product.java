package main.app.entity;

public class Product {
    public String name;
    public String description;
    public String model;
    public String brand;
    public double price;

    public Product(String name, String description,String model,String brand, double price) {
        this. name = name;
        this.description = description;
        this.model = model;
        this.brand = brand;
        this.price = price;
    }
}
