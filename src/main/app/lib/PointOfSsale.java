package main.app.lib;

import javafx.util.Pair;
import main.app.entity.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.List;

public class PointOfSsale {
    public Hashtable<Integer, Client> customers;
    public Hashtable<Integer, StockElement> stock;
    public Hashtable<Integer, Order> orders ;
    public List<Quote> quotes = new ArrayList<>();

    public PointOfSsale(Hashtable<Integer, Client> customers, Hashtable<Integer, StockElement> stock, Hashtable<Integer, Order> orders) {
        this.customers = customers;
        this.stock = stock;
        this.orders = orders;

        this.processOrders();
    }

    private void processOrders() {
        // Walk over orders
        for (Integer orderK : this.orders.keySet()) {
            // get order
            Order order= this.orders.get(orderK);

            String clientName;
            String deliveryDate;
            List<Pair<Integer, Product>> productList = new ArrayList<>();
            double subtotal = 0;
            double discount = 0;
            double total = 0;

            // get client name
            clientName = order.client.name;

            // get deliveryDate
            deliveryDate = order.dueDate.toString();

            // walk over order list
            for (int listK = 0; listK < order.list.size(); listK++) {
                // get order list Item
                Pair<Integer, Integer> orderElement = order.list.get(listK);
                Integer stockId = orderElement.getKey();
                Integer quantity = orderElement.getValue();
                StockElement stockElement = this.stock.get(stockId);

                // Enough Stock?
                if (!this.areEnoughInStock(stockId, quantity)) {
                    stockElement.requestedUnits += quantity;

                    // get calendar instance
                    Calendar calendar = Calendar.getInstance();
                    // set calendar date to order dueDate
                    calendar.setTime(order.dueDate);
                    // add two weeks
                    calendar.add(Calendar.WEEK_OF_YEAR, 2);
                    // add two weeks to delivery date
                    order.dueDate = calendar.getTime();
                }
                
                // add subTotal
                subtotal += stockElement.product.price * quantity;

                // append to productList
                productList.add(
                    new Pair<Integer, Product>(quantity, stockElement.product)
                );
            }

            // calc discount
            discount = this.calcDiscount(subtotal);

            // calc total
            total = subtotal - discount;
            
            this.appendToQuotes(clientName, deliveryDate, productList, subtotal, discount, total);
        }
    }

    private double calcDiscount(double subtotal) {
        double res = 0;

        if (subtotal > 100000 && subtotal <= 200000) {
            res = subtotal * 0.2;
        } else if (subtotal > 200000) {
            res = subtotal * 0.3;
        }

        return res;
    }

    private void appendToQuotes(String clientName, String deliveryDate,List<Pair<Integer, Product>> productList, double subtotal,double discount, double total) {
        this.quotes.add(
                new Quote(clientName, deliveryDate, productList, subtotal, discount, total)
        );
    }

    private boolean areEnoughInStock(Integer stockId, Integer quantity) {
        StockElement stockElement = this.stock.get(stockId);

        return stockElement.unitsInStock >= quantity;
    }

    public void printTickets() {
        for (int i = 0; i < this.quotes.size(); i++) {
            System.out.println(this.quotes.get(i));
        }
    }
}
