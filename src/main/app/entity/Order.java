//Desarrolladores
// Gabriela Moreno Quintana
// Robberto Maurer
// Ricardo de Leon
// J.G. Marin

// Compilacion:
// Ejecucion:

package main.app.entity;

import javafx.util.Pair;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Order {
   public Client client;
    // Pairs Syntax: stockId, quantity
   public List<Pair<Integer, Integer>> list;
   public Date dueDate;

    public Order(Client client, List<Pair <Integer, Integer>> list, String dueDate){
        this.client = client;
        this.list = list;
        try {
            this.dueDate = new SimpleDateFormat("yyyy/MM/dd").parse(dueDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
