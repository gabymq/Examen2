//Desarrolladores
// Gabriela Moreno Quintana
// Robberto Maurer
// Ricardo de Leon
// J.G. Marin

// Compilacion:
// Ejecucion:


package main.app.entity;

import javafx.util.Pair;
import java.text.NumberFormat;
import java.util.List;

public class Quote {
    public String clientName;
    public String deliveryDate;
    public List<Pair<Integer, Product>> productList;
    public double subTotal;
    public double discount;
    public double total;

    public Quote(String clientName,String deliveryDate,List<Pair<Integer, Product>> productList, double subTotal,double discount, double total) {
        this.clientName = clientName;
        this.deliveryDate = deliveryDate;
        this.productList = productList;
        this.subTotal = subTotal;
        this.discount = discount;
        this.total = total;
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String res = "";
        res += "Nombre del cliente: " + this.clientName + "\n";
        res += "Fecha de Entrega" + this.deliveryDate + "\n";
        res += "\n===== Detalle de compra ====\n";
        res += "cant:\tP.U.\t\tprod:\tdescripcion\t\tmarca\tmodelo\t\tprecio";

        for (int i = 0; i < this.productList.size(); i++) {
            Pair<Integer, Product> listItem = this.productList.get(i);
            Integer quantity = listItem.getKey();
            Product product = listItem.getValue();

            res += "\n"+quantity +"\t\t" + formatter.format(product.price) + "    " + product.name + "\t"+ product.description;
            res += "\t\t" + product.brand + "\t" + product.model + "\t\t" + formatter.format(product.price*quantity);
        }

        res += "\n\nSubtotal: " + formatter.format(this.subTotal) + "\n";
        res += "Descuento: " + formatter.format(this.discount) + "\n";
        res += "Total: " + formatter.format(this.total) + "\n";

        return res;
    }
}
