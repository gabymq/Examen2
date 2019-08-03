//Desarrolladores
// Gabriela Moreno Quintana
// Robberto Maurer
// Ricardo de Leon
// J.G. Marin

// Compilacion y Ejecucuion:  Descargar e instalar itellij IDEA, abrir proyecto, dar click en el boton de RunProgram.
/*
 * "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2019.2\lib\idea_rt.jar=50126:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2019.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_211\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\rt.jar;C:\Users\gaby\IdeaProjects\Examen2\out\production\Examen2" main.app.Init

 **/
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
