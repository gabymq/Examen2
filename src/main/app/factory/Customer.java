package main.app.factory;

import main.app.entity.Client;

import java.util.Hashtable;

public class Customer {
    public static Hashtable<Integer, Client>populate(){
        Hashtable<Integer, Client> res = new Hashtable<Integer, Client>();
        Client client1 = new Client("Gerardo Ponce");
        Client client2 = new Client("Andrea Jimenez");
        Client client3 = new Client("Berenice Urtado");
        Client client4 = new Client("Dolores Flores");

        res.put(0,client1);
        res.put(1,client2);
        res.put(2,client3);
        res.put(3,client4);

        return res;
    }
}
