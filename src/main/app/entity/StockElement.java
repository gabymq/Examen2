//Desarrolladores
// Gabriela Moreno Quintana
// Robberto Maurer
// Ricardo de Leon
// J.G. Marin

// Compilacion y Ejecucuion: Descargar e instalar itellij IDEA, abrir proyecto, dar click en el boton de RunProgram.
/*
 * "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2019.2\lib\idea_rt.jar=50126:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2019.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_211\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_211\jre\lib\rt.jar;C:\Users\gaby\IdeaProjects\Examen2\out\production\Examen2" main.app.Init

 **/
package main.app.entity;

public class StockElement {
    public Product product;
    public int unitsInStock;
    public int requestedUnits;

    public StockElement(Product product, int unitsInStock, int requestedUnits) {
        this.product = product;
        this.unitsInStock = unitsInStock;
        this.requestedUnits = requestedUnits;
    }

    @Override
    public String toString() {
        String res = "";

       res += this.product.name+"\t" +this.product.brand + "\t" + this.product.model + "\t" + this.unitsInStock + "\t\t\t\t\t" + this.requestedUnits;

        return res;
    }
}
