package main.app.factory;

import javafx.util.Pair;
import main.app.entity.Client;
import main.app.entity.Order;
import main.app.entity.Product;
import main.app.entity.StockElement;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class OrderList {
    public static Hashtable<Integer, Order>populate(Hashtable<Integer, Client> clients, Hashtable<Integer, StockElement> stock){
        Hashtable<Integer, Order> res = new Hashtable<Integer, Order>();

        // walk Users
        for (Integer key: clients.keySet()) {
            Order order;
            List<Pair<Integer, Product>> list = new ArrayList<>();

            switch (key) {
                case 0:
                    list.add(new Pair<Integer, Product>(30, stock.get(0).product));
                    list.add(new Pair<Integer, Product>(30, stock.get(1).product));
                    list.add(new Pair<Integer, Product>(30, stock.get(2).product));
                    list.add(new Pair<Integer, Product>(30, stock.get(3).product));

                    order = new Order(clients.get(key), list, "2019/08/10");
                    break;
                case 1:
                    list.add(new Pair<Integer, Product>(40, stock.get(0).product));
                    list.add(new Pair<Integer, Product>(40, stock.get(1).product));

                    order = new Order(clients.get(key), list, "2019/08/06");
                    break;
                case 2:
                    list.add(new Pair<Integer, Product>(100, stock.get(0).product));
                    list.add(new Pair<Integer, Product>(100, stock.get(2).product));
                    list.add(new Pair<Integer, Product>(100, stock.get(3).product));

                    order = new Order(clients.get(key), list, "2019/08/17");
                    break;
                case 3:
                    list.add(new Pair<Integer, Product>(20, stock.get(0).product));

                    order = new Order(clients.get(key), list, "2019/09/03");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + key);
            }

            res.put(key, order);
        }

        return res;
    }
}
