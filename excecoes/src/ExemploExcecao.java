import java.text.NumberFormat;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");

        valor = NumberFormat.getInstance().parse("a1.75");
        
        System.out.println(valor);
       
    }
}
