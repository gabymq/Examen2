package main.app.factory;

import javafx.util.Pair;
import main.app.entity.Client;
import main.app.entity.Order;
import main.app.entity.StockElement;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class OrderList {
    public static Hashtable<Integer, Order>populate(Hashtable<Integer, Client> customers, Hashtable<Integer, StockElement> stock){
        Hashtable<Integer, Order> res = new Hashtable<Integer, Order>();

        // walk Users
        for (Integer key: customers.keySet()) {
            Order order;
            // Pairs Syntax: stockId, quantity
            List<Pair<Integer, Integer>> list = new ArrayList<>();

            switch (key) {
                case 0:
                    list.add(new Pair<Integer, Integer>(0, 30));
                    list.add(new Pair<Integer, Integer>(1,30 ));
                    list.add(new Pair<Integer, Integer>(2, 30 ));
                    list.add(new Pair<Integer, Integer>(3, 30 ));


                    order = new Order(customers.get(key), list, "2019/08/10");
                    break;
                case 1:
                    list.add(new Pair<Integer, Integer>(0,40));
                    list.add(new Pair<Integer, Integer>(1,40));

                    order = new Order(customers.get(key), list, "2019/08/06");
                    break;
                case 2:
                    list.add(new Pair<Integer, Integer>(0,100));
                    list.add(new Pair<Integer, Integer>(2, 100));
                    list.add(new Pair<Integer, Integer>(3, 100));

                    order = new Order(customers.get(key), list, "2019/08/17");
                    break;
                case 3:
                    list.add(new Pair<Integer, Integer>(0,20));

                    order = new Order(customers.get(key), list, "2019/09/03");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + key);
            }

            res.put(key, order);
        }

        return res;
    }
}
