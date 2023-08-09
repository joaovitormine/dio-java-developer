import java.text.ParseException;
import java.text.NumberFormat;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor;

        try{

            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch(ParseException e ) {
            e.printStackTrace();

        }
    }
}
