//Desarrolladores
// Gabriela Moreno Quintana
// Robberto Maurer
// Ricardo de Leon
// J.G. Marin

// Compilacion y Ejecucuion:
/*
 * "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2019.2\lib\idea_rt.jar=50126:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2019.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_211\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\rt.jar;C:\Users\gaby\IdeaProjects\Examen2\out\production\Examen2" main.app.Init

 **/
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
