package main.app.entity;

public class StockElement {
    public Product product;
    public int unitsInStock;
    public int requestedUnits;

    public StockElement(Product product, int unitsInStock, int requestedUnits) {
        this.product = product;
        this.unitsInStock = unitsInStock;
        this.requestedUnits = requestedUnits;
    }
}
