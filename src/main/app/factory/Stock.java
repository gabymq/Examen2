package main.app.factory;

import main.app.entity.Product;
import main.app.entity.StockElement;

import java.util.Hashtable;

public class Stock {
    public static Hashtable<Integer, StockElement>populate() {
        // | int | StockElement |
        Hashtable<Integer, StockElement> res = new Hashtable<Integer, StockElement>();

        // ○ Laptops - $6000 c/u - En almacén hay 200
        // ○ Monitores - $2500 c/u - En almacén hay 200
        // ○ Teclados - $500 c/u - En almacén hay 200
        // ○ Mouse - $400 c/u - En almacén hay 200
        // ○ Enfriadores - $1500 c/u - En almacén hay 200
        Product laptop = new Product("Laptop", "computadora","Inspi", "DELL", 6000);
        Product monitor = new Product("Monitor","SHUDTv 32\"","SM32","Samsung",2500);
        Product teclado = new Product("teclado","Inalambrico","s3500", "Dell",500);
        Product mouse = new Product("mouse","Inalambrico", "FN705","Dell",400);
        Product enfriador = new Product("enfriador", "USB","F2","Borago",1500);

        res.put(0, new StockElement(laptop, 200, 0));
        res.put(1, new StockElement(monitor, 200, 0));
        res.put(2, new StockElement(teclado, 200, 0));
        res.put(3, new StockElement(mouse, 200, 0));
        res.put(4, new StockElement(enfriador, 200, 0));

        return res;
    }
}
