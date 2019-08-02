package main.app.entity;

import java.util.Hashtable;
import java.util.Map;
import main.app.entity.Product;

public class Quote {
    public String clientName;
    public String deliveryDate;
    public Map<int, Product> productList;
    public double subTotal;
    public double discount;

    public Quote(String clientName,String deliveryDate,Map<int, Product> productList, double subTotal,double discount) {
        this.clientName = clientName;
        this.deliveryDate = deliveryDate;
        this.productList = productList;
        this.subTotal = subTotal;
        this.discount = discount;
    }
}
