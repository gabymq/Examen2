package main.app;

import main.app.entity.Client;
import main.app.entity.Order;
import main.app.entity.StockElement;
import main.app.factory.Customer;
import main.app.factory.OrderList;
import main.app.factory.Stock;
import main.app.lib.PointOfSsale;

import java.util.Hashtable;

public class Init {
    public static void main(String[] args) {
        /* Init variables */
        Hashtable<Integer, Client> customers = Customer.populate();
        Hashtable<Integer, StockElement> stock = Stock.populate();
        Hashtable<Integer, Order> orders = OrderList.populate(customers, stock );
        PointOfSsale pos = new PointOfSsale(customers, stock, orders);

        pos.printTickets();
        // System.out.println("Hola");
    }
}
