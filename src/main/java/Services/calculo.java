package Services;
import Models.ProductsMock;
public class calculo {
    ProductsMock productsMock = new ProductsMock();
    public static double Calc(){
        double result = ProductsMock.preco * ProductsMock.quantidade;

        return result;


    }
}
